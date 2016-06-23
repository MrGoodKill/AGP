
extern printf,exit
section .data
print:	db "Value Asked=%d", 10, 0
a:	dd	0
b:	dd	0
c:	dd	0


section .text
global main

main:
	pop eax
	mov [c],eax
	pop eax
	mov [b],eax
	pop eax
	mov [a],eax
	pop eax
	mov [c],eax
	pop eax
	mov [b],eax
	pop eax
	mov [a],eax
	mov eax,[a]
	push 3
	pop ebx
	cmp eax,ebx
	jne cond2
	mov eax,[d]
	push 1
	pop ebx
	cmp eax,ebx
	jne cond1
	mov eax,5
	mov [c],eax
cond1:
	mov eax,0
	mov [a],eax
	jmp endelse2
cond2:
endelse2:
	call exit
