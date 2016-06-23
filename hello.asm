
extern printf,exit
section .data
print:	db "%d", 10, 0
printstr:	db "%s", 10, 0
temp:	dd	0
str1:	db "                'Je pense à un nombre'",0
str2:	db "Le premier jeu programmé entierement en langage AGP !",0
str3:	db "                         ----",0
str4:	db "",0
str5:	db "                         ----",0
str6:	db "",0
str7:	db "Je pense à un nombre...",0
str8:	db "A ton avis, ce nombre est : ",0
str9:	db "Argggg ! Tu m'as vaincu...",0
str10:	db "",0
str11:	db "Nombre de coups nécessaires pour gagner : ",0
str12:	db "Non malheureux ! C'est plus petit que ça!",0
str13:	db "Ahaha non ! Mon nombre est beaucoup plus grand que le tien, comme ma bite !",0
nombre:	dd	0
answer:	dd	0
victoire:	dd	0
nbcoup:	dd	0


section .bss

sinput: resb 255


section .text
global main

main:
	push dword str1
	push dword printstr
	call printf
	push dword str2
	push dword printstr
	call printf
	push dword str3
	push dword printstr
	call printf
	push dword str4
	push dword printstr
	call printf
	push dword str5
	push dword printstr
	call printf
	push dword str6
	push dword printstr
	call printf
	
	push eax
	push edx
	rdtsc
	mov edx, 0
	push 100
	pop ebx
	div ebx
	mov [temp], edx
	pop edx
	pop eax
	push dword [temp]
	pop eax
	mov [nombre],eax
	mov eax,0
	mov [answer],eax
	mov eax,0
	mov [victoire],eax
	mov eax,0
	mov [nbcoup],eax
	push dword str7
	push dword printstr
	call printf
while4:
	mov eax,[victoire]
	push 0
	pop ebx
	cmp eax,ebx
	jne cond4
	push 1
	mov eax,[nbcoup]
	pop ebx
	add eax,ebx
	mov [nbcoup],eax
	push dword str8
	push dword printstr
	call printf
	mov edx, 255
	mov ecx, sinput
	mov ebx, 0
	mov eax, 3
	int 80h
	mov eax, sinput
	call atoi
	mov [answer], eax
	mov eax,[answer]
	push dword[nombre]
	pop ebx
	cmp eax,ebx
	jne cond1
	push dword str9
	push dword printstr
	call printf
	mov eax,1
	mov [victoire],eax
	push dword str10
	push dword printstr
	call printf
	push dword str11
	push dword printstr
	call printf
	push dword[nbcoup]
	push dword print
	call printf
cond1:
	mov eax,[answer]
	push dword[nombre]
	pop ebx
	cmp eax,ebx
	jle cond2
	push dword str12
	push dword printstr
	call printf
cond2:
	mov eax,[answer]
	push dword[nombre]
	pop ebx
	cmp eax,ebx
	jge cond3
	push dword str13
	push dword printstr
	call printf
cond3:
	jmp while4
cond4:
	push 0
	call exit
atoi:
	push ebx
	push ecx
	mov ebx, eax
	mov eax, 0
	mov ecx, 0
atoi_loop:
	cmp byte[ebx], 0
	je end_atoi
	cmp byte[ebx], 10
	je end_atoi
	mov cl, byte[ebx]
	sub cl, '0'
	cmp cl, 9
	jg end_atoi
	imul eax, 10
	add eax, ecx
	inc ebx
	jmp atoi_loop
end_atoi:
	pop ecx
	pop ebx
	ret
