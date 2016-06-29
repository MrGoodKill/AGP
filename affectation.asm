
extern printf,exit
section .data
print:	db "%d", 10, 0
printstr:	db "%s", 10, 0
funcReturn:	dd	0
temp:	dd	0
main$a:	dd	0
main$b:	dd	0


section .bss

sinput: resb 255


section .text
global main

main:
	mov eax,5			;[Final2]
	mov [main$a],eax			;[Affct]
	mov eax,2			;[Final2]
	mov [main$b],eax			;[Affct]
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
