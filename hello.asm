
extern printf,exit
section .data
print:	db "Value Asked=%d", 10, 0


section .text
global main

main:
	mov eax,[a]			[Final2]
	push 3			[Final2]
	pop ebx			[Cond]
	cmp eax,ebx			[Cond]
	jne cond2			[Operator]
	mov eax,[d]			[Final2]
	push 1			[Final2]
	pop ebx			[Cond]
	cmp eax,ebx			[Cond]
	jne cond1			[Operator]
	mov eax,5			[Final2]
	mov [c],eax			[Affct]
cond1:
	mov eax,0			[Final2]
	mov [a],eax			[Affct]
	jmp endelse2			[If2]
cond2:
endelse2:
	call exit			[Root]
