grammar Hello;
r returns [Root root]: 
'main(' l=listvar')' {$root = new Root($l.lv);};

listvar returns[Listvar lv]:
v=Var {$lv = new Listvar(new Var($v.getText()));};

Var:[a-zA-Z]+;


WS : [ \t\r\n]+ -> skip ;