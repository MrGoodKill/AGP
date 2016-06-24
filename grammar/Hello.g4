grammar Hello;

r returns [Root root]: 
	p=prog
		{$root = new Root($p.p);};
		
prog returns [Prog p]:
	l1=listfunc 'main(' l=listvar'){'b=bloc'}' l2=listfunc
		{$p = new Prog($l.lv,$b.bc,$l1.lf,$l2.lf);}
	| l1=listfunc 'main(){'b=bloc'}' l2=listfunc
		{$p = new Prog($b.bc,$l1.lf,$l2.lf);};


listfunc returns [ListFunc lf]:
	f=function l=listfunc
		{$lf=new ListFunc($f.fct, $l.lf);}
	| {$lf = new ListFunc();};

function returns [Func fct]:
	v=WORD'('l=listvar'){'b=bloc'}'
		{$fct = new Func($l.lv,$b.bc,new Var($v.getText()));};

listvar returns[ListVar lv]:
	v=WORD
		{$lv = new ListVar(new Var($v.getText()));}
	| v=WORD','l=listvar
		{$lv = new ListVar(new Var($v.getText()),$l.lv);};

bloc returns[Bloc bc]:
	i=inst b=bloc
		{$bc = new Bloc($i.instruct,$b.bc);}
	| 
		{$bc = new Bloc();};

inst returns[Inst instruct]: 
	a=affct';'
		{$instruct = new Inst($a.aff);}
	| d1=declaration';'
		{$instruct = new Inst($d1.decl);}
	| d2=declaffct';'
		{$instruct = new Inst($d2.decaf);}
	| c=comment
		{$instruct = new Inst($c.com);}
	| i=if2
		{$instruct = new Inst($i.i);}
    | w=while2
		{$instruct = new Inst($w.w);}
	| as=ask';'
		{$instruct = new Inst($as.a);}
	| p=print';'
		{$instruct = new Inst($p.p);}
	| call=callFunction';'
		{$instruct = new Inst($call.call);};

callFunction returns[CallFunction call]:
	v=WORD'('l=listvar')'
		{$call = new CallFunction(new Var($v.getText()),$l.lv);};

print returns[Print p]:
	'print('v=WORD')'
		{$p = new Print(new Var($v.getText()));}
	| 'print('s=string2')'
		{$p = new Print($s.s);};
		
string2 returns[String2 s]:
	w=STR
		{$s = new String2(new Txt($w.getText()));};
		
ask returns[Ask a]:
	'ask('v=WORD')'
		{$a = new Ask(new Var($v.getText()));};

declaration returns[Decl decl]:
	'var 'l=listvar
		{$decl = new Decl($l.lv);};
		
affct returns[Affct aff]:
	v=WORD':='o=operation
		{$aff = new Affct(new Var($v.getText()),$o.op);};

comment returns[Comment com]:
	'/*'(numb|','|';'|'!'|'.'|'?'|'*'|'/'|'-'|'Ã'|'©'|'¨')*'*/'
		{$com = new Comment();};
		
declaffct returns[Decaf decaf]:
	'var 'a=affct
		{$decaf = new Decaf($a.aff);};
		
//if2 returns[If2 i]:
//	'if('c=cond'){'b=bloc'}'
//		{$i = new If2($c.c,$b.bc);};

if2 returns[If2 i]: 
    'if('c=cond'){'b=bloc'}''else{'b2=bloc'}' {$i = new If2($c.c,$b.bc,$b2.bc);}
    | 'if('c=cond'){'b=bloc'}'{$i = new If2($c.c,$b.bc);};

    
//else2 returns [Else2 e]:
//    'else{'b=bloc'}' {$e = new Else2($b.bc);};


while2 returns[While2 w]:
	'while('c=cond'){'b=bloc'}'
		{$w = new While2($c.c,$b.bc);};

cond returns[Cond c]:
	op1=operation'='op2=operation {$c = new Cond($op1.op,$op2.op,"=");}
	| op1=operation'>'op2=operation {$c = new Cond($op1.op,$op2.op,">");}
	| op1=operation'<'op2=operation {$c = new Cond($op1.op,$op2.op,"<");}
	| op1=operation'<='op2=operation {$c = new Cond($op1.op,$op2.op,"<=");}
	| op1=operation'>='op2=operation {$c = new Cond($op1.op,$op2.op,">=");};

operation returns [Op op] :
    f1=factor'+'op2=operation {$op=new Op($f1.f,$op2.op,"+");}
    | f1=factor'-'op2=operation {$op=new Op($f1.f,$op2.op,"-");}
    | f1=factor {$op=new Op($f1.f);};
    
factor returns [Factor f] :
    f1=factor'*'f2=final2 {$f=new Factor($f1.f,$f2.f,"*");}
    | f1=factor'/'f2=final2 {$f=new Factor($f1.f,$f2.f,"/");}
    | f3=final2 {$f=new Factor($f3.f);};
	
final2 returns [Final2 f] :
    '('op1=operation')' {$f=new Final2($op1.op);}
    | nb1=numb {$f=new Final2($nb1.nb);};
	
numb returns [Number nb] :
    c=CONST  {$nb=new Number(new Const2($c.getText()));}
    | v=WORD {$nb=new Number(new Var($v.getText()));}
	| ra=rand {$nb=new Number($ra.ra);};

rand returns [Random ra] :
	'rand('n=numb')' {$ra=new Random($n.nb);};
	
CONST: [0-9]+ ;
WORD : [a-zA-Z]+ ;
PCT : [?!;:.] ;
WS : [ \t\r\n]+ -> skip ;
STR : '"'(.)*?'"';