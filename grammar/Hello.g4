grammar Hello;
r returns [Root root]: 
'main(' l=listvar'){'b=bloc'}' {$root = new Root($l.lv,$b.bl);};

listvar returns[Listvar lv]:
v=Var {$lv = new Listvar(new Var($v.getText()));}
| v=Var','l=listvar {$lv = new Listvar(new Var($v.getText()),$l.lv);};

bloc returns[Bloc bl]: 
i=inst b=bloc {$bl= new Bloc($i.in,$b.bl);};

inst returns[Inst in]:  
        a=affct';' {$in = new Inst($a.af);}
        | d=decl';' {$in = new Inst($d.de);}
        | d=decaf';' {$in = new Inst($d.de);}
 //     | c=comment {$in = new Inst($c.comment);}
        | b=boucle {$in = new Inst($b.bo);};

decl returns [Decl de]: 
'var'l=listvar {$de = new Decl($l.lv);};

affct returns [Affct af] :
    v=Var':='o1=op {$af=new Affct(new Var($v.getText()),,$o1.o);};
    
boucle returns [Boucle bo]:
    i=if2 {$bo = new Boucle($i.if);}
    | w=while2 {$bo = new Boucle($w.wh);};


comment: '/*'(nb|','|';'|'!'|'.'|'?'|'*'|'/')*'*/';

decaf returns [Decaf de] :
'var'a=affct {$de = new Decaf($a.af);};

if2 returns[If2 if]: 
    'if('c=cond'){'b=bloc'}'e=else2 {$if = new If2($c.co,$b.bl,$e.el);}
    | 'if('c=cond'){'b=bloc'}' {$if = new If2($c.co,$b.bl);};

else2 returns [Else2 el]:
    'else{'b=bloc'}' {$el = new Else2($b.bl);};

while2 returns [While2 wh]: 
    'while('c=cond'){'b=bloc'}' {$wh = new While2($c.co,$b.bl);};

cond returns [Cond co]:
    o1=op'='o2=op {$co = new Cond($o1.o,$o2.o,"=");}
    | o1=op'>'o2=op {$co = new Cond($o1.o,$o2.o,">");}
    | o1=op'<'o2=op {$co = new Cond($o1.o,$o2.o,"<");}
    | o1=op'<='o2=op {$co = new Cond($o1.o,$o2.o,"<=");}
    | o1=op'>='o2=op {$co = new Cond($o1.o,$o2.o,">=");};

op returns [Op o] :
    f=factor'+'o1=op {$o=new Op($f.fac,$o1.o,"+");}
    | f=factor'-'o1=op {$o=new Op($f.fac,$o1.o,"-");}
    | f=factor {$o=new Op($f.fac);};
    
factor returns [Factor fac] :
    fa=factor'*'fi=final2 {$fac=new Factor($fa.fac,$fi.fi,"*");}
    | fa=factor'/'fi=final2 {$fac=new Factor($fa.fac,$fi.fi,"/");}
    | f=final2 {$fac=new Factor($f.fi);};

final2 returns [Final2 fi] :
    '('o1=op')' {$fi=new Final2($o1.o);}
    | n1=nb {$fi=new Final2($n1.n);};

nb returns [Nb n] :
    c=Const2  {$n=new Nb(new Const2($c.getText()));}
    | v=Var {$n=new Nb(new Var($v.getText()));};

Const2: [0-9]+ ;

Var: [a-zA-Z]+;

WS : [ \t\r\n]+ -> skip ;