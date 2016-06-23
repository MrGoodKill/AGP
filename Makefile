all:
	java -jar out/artifacts/AGP_jar/AGP.jar
	nasm -f elf32 hello.asm && ld -melf_i386 -I/lib/ld-linux.so.2 -lc --entry main hello.o
	./hello
