
extern printf,exit
section .data
print:	db "%d", 10, 0
printstr:	db "%s", 10, 0
funcReturn:	dd	0
temp:	dd	0
main$n:	dd	0
main$a:	dd	0
fibonacci$n:	dd	0
fibonacci$a:	dd	0
fibonacci$b:	dd	0
fibonacci$c:	dd	0


section .bss

sinput: resb 255


section .text
global main

fibonacci:
	pop eax			;[Func]
	mov [funcReturn],eax			;[Func]
	pop eax			;[Func]
	mov [fibonacci$n],eax			;[Func]
	mov eax,[fibonacci$n]			;[Final2]
	push 1			;[Final2]
	pop ebx			;[Cond]
	cmp eax,ebx			;[Cond]
	jg cond1			;[Operator]
	push dword[fibonacci$n]			;[Final2]
	mov eax,[funcReturn]			;[Return2]
	push eax			;[Return2]
	ret			;[Return2]
	jmp endelse1			;[If2]
cond1:
	
	push 1			;[Final2]
	mov eax,[fibonacci$n]			;[Final2]
	pop ebx			;[Op]
	sub eax,ebx			;[Operator]
	push eax			;[Op]
	call fibonacci			;[CallFunction]
	pop eax			;[Number]			;[Final2]
	mov [fibonacci$a],eax			;[Affct]
	
	push 2			;[Final2]
	mov eax,[fibonacci$n]			;[Final2]
	pop ebx			;[Op]
	sub eax,ebx			;[Operator]
	push eax			;[Op]
	call fibonacci			;[CallFunction]
	pop eax			;[Number]			;[Final2]
	mov [fibonacci$b],eax			;[Affct]
	push dword[fibonacci$b]			;[Final2]
	mov eax,[fibonacci$a]			;[Final2]
	pop ebx			;[Op]
	add eax,ebx			;[Operator]
	mov [fibonacci$c],eax			;[Affct]
	push dword[fibonacci$c]			;[Final2]
	mov eax,[funcReturn]			;[Return2]
	push eax			;[Return2]
	ret			;[Return2]
endelse1:
	mov eax,[funcReturn]			;[Func]
main:
	mov eax,[esp+8]			;[Prog]
	call atoi			;[Prog]
	mov [main$n], eax			;[Prog]
	
	push dword[main$n]			;[Final2]
	call fibonacci			;[CallFunction]
	pop eax			;[Number]			;[Final2]
	mov [main$a],eax			;[Affct]
	push dword [main$a]			;[Print]
	push dword print			;[Print]
	call printf			;[Print]
	push 0			;[Prog]
	call exit			;[Prog]
atoi:
	push ebx			;[Root]
	push ecx			;[Root]
	mov ebx, eax			;[Root]
	mov eax, 0			;[Root]
	mov ecx, 0			;[Root]
atoi_loop:
	cmp byte[ebx], 0			;[Root]
	je end_atoi			;[Root]
	cmp byte[ebx], 10			;[Root]
	je end_atoi			;[Root]
	mov cl, byte[ebx]			;[Root]
	sub cl, '0'			;[Root]
	cmp cl, 9			;[Root]
	jg end_atoi			;[Root]
	imul eax, 10			;[Root]
	add eax, ecx			;[Root]
	inc ebx			;[Root]
	jmp atoi_loop			;[Root]
end_atoi:
	pop ecx			;[Root]
	pop ebx			;[Root]
	ret			;[Root]
