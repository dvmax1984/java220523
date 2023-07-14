- Homework
    - Homework_001
    
        Ex001 [КОД](/Homework/Homework_001/Ex_001/program.java)
        
        Ex002 [КОД](/Homework/Homework_001/Ex_002/program.java)
        
        Ex003 [КОД](/Homework/Homework_001/Ex_003/program.java) - калькулятор
        
        Ex004 [КОД](/Homework/Homework_001/Ex_004/program.java) - подбор решения

    - Homework_002

        Ex001 [КОД](/Homework/Homework_002/Ex_001/program.java) - список файлов в каталоге, вывод расширений

        Ex002 [КОД](/Homework/Homework_002/Ex_002/program.java) - сортировка пузырьком и запись в файл

        Ex003 [КОД](/Homework/Homework_002/Ex_003/program.java) - парсинг JSON

        Ex004 [КОД](/Homework/Homework_002/Ex_004/program.java) - запись действий калькул в файл

        Ex005 [КОД](/Homework/Homework_002/Ex_005/program.java) - преобразование JSON 2 SQL

    - **Homework_003**

        Ex001 [КОД](/Homework/Homework_003/Ex_001/program.java) - список файлов в каталоге, вывод расширений

        Ex002 [КОД](/Homework/Homework_003/Ex_002/program.java) - сортировка пузырьком и запись в файл


- Seminar

    - Seminar_001

        Ex001 [КОД](/Seminar/Seminar_001/Seminar1.java)

        Ex002 [КОД](/Seminar/Seminar_001/Seminar2.java)

        Ex003 [КОД](/Seminar/Seminar_001/Seminar3.java)

        Ex004 [КОД](/Seminar/Seminar_001/Seminar4.java)
    
    - **Seminar_002**

        Ex001 [КОД](/Seminar/Seminar_002/program.java)
        
        Ex002 [КОД](/Seminar/Seminar_002/program1.java) - чтение каталога и запись файла

- Lecture

    - Lecture_001

        Ex001 [КОД](/Lecture/Lecture_001/)

    - Lecture_002

        Ex001 [КОД](/Lecture/Lecture_002/)


**Компиляция в jar**
===
1) javac program.java

2) jar cvf program.java program.class 

3) jar cfm program.jar manifest.mf program.class

jar cfm program.jar META-INF/MANIFEST.MF Homework/Homework_002/Ex_001/program.class

**MANIFEST.MF**
======
Manifest-Version: 1.0
Main-Class: Homework.Homework_002.Ex_001.program
======


Начал изучение

%d: целочисленных значений
%x: для вывода шестнадцатеричных чисел
%f: для вывода чисел с плавающей точкой
%e: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
%c: для вывода одиночного символа
%s: для вывода строковых значений
