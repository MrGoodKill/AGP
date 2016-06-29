
extern printf,exit
section .data
print:	db "%d", 10, 0
printstr:	db "%s", 10, 0
funcReturn:	dd	0
temp:	dd	0
str1:	db "Impression avant attente /n",0
str2:	db "Attente finie, trop longue ou pas ? /n",0
str3:	db "votre reponse:",0
main$n:	dd	0


section .bss

sinput: resb 255


section .text
global main

main:
	mov eax,[esp+8]			;[Prog]
	call atoi			;[Prog]
	mov [main$n], eax			;[Prog]
	push dword str1			;[Print]
	push dword printstr			;[Print]
	call printf			;[Print]
	push 100000000			;[Final2]
	call wait			;[CallFunction]
	push dword str2			;[Print]
	push dword printstr			;[Print]
	call printf			;[Print]
	mov edx, 255			;[Ask]
	mov ecx, sinput			;[Ask]
	mov ebx, 0			;[Ask]
	mov eax, 3			;[Ask]
	int 80h			;[Ask]
	mov eax, sinput			;[Ask]
	call atoi			;[Ask]
	mov [main$a], eax			;[Ask]
	push dword str3			;[Print]
	push dword printstr			;[Print]
	call printf			;[Print]
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
