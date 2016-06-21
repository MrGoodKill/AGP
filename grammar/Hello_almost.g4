grammar Hello;
r returns [Root root]: 
'main(' l=listvar')' {$root = new Root($l.lv)};

listvar returns[Listvar lv]:
v=VAR {$lv = new Listvar($v};

VAR: [a-zA-Z]+;

//VAR returns [Var var]: 
//v=[a-zA-Z]+ {$var= new Var($v.text);


WS : [ \t\r\n]+ -> skip ;