# Student-GradeBook
Simulate a gradebook using Linked Lists

Input for this program was guaranteed, below is a sample input and output
Students are added to a linked list representing a class 
Each node is basically an array holding the information of a student with their name, ID number, and grades
Commands including adding a record, deleting a record, printing stats for class, printing stats for all classes, and searching for a student by name or their ID number

SAMPLE INPUT AND OUTPUT
3
CSC-1980
CSC-2100
CSC-2280
DISPLAYSTATS CSC-1980
DISPLAYSTATS ALL
DISPLAYSTATS CSC-1980
DISPLAYSTATS CSC-1980
ADDRECORD CSC-4076 1265902 RUSTY WHITTIKER 1 38 4
DELETERECORD 1265902
ADDRECORD CSC-2280 1262428 MOHAMED DUBBERLY 96 98 86
DELETERECORD 1262428
ADDRECORD CSC-2100 1264229 JOHNNA MOZELAK 17 8 99
ADDRECORD CSC-1980 1266004 ROXANA YETZER 78 81 79
ADDRECORD CSC-2100 1262308 HILTON DESHAIES 71 6 81
ADDRECORD CSC-2280 1261683 JOAQUINA BREAZEAL 88 33 17
ADDRECORD CSC-2280 1264888 BENNETT ROSSEY 85 89 73
DELETERECORD 1264229
ADDRECORD CSC-1980 1261740 SAVANNAH BROWNIE 96 89 87
ADDRECORD CSC-2280 1263840 TANA MANDIGO 70 80 70
ADDRECORD CSC-2280 1263582 EARNEST LAWCEWICZ 90 85 98
DELETERECORD 1262308
ADDRECORD CSC-1980 1265786 JERE WAHLER 91 74 75
ADDRECORD CSC-2280 1261320 ARCELIA BAILLY 81 88 73
DELETERECORD 1261740
ADDRECORD CSC-2280 1261897 SHAMIKA CATCHINGS 12 1 23
DISPLAYSTATS CSC-1980
ADDRECORD CSC-2100 1261422 OPHELIA BELTRE 95 86 83
ADDRECORD CSC-1980 1262495 ARTHUR EIMER 46 41 86
ADDRECORD CSC-2100 1262519 CARMEL ELIASON 94 97 91
DISPLAYSTATS CSC-2280
ADDRECORD CSC-2100 1265055 KRISTLE SCHOPPE 81 78 70
ADDRECORD CSC-2280 1265126 ELENOR SHEROD 91 98 89
DELETERECORD 1265055
ADDRECORD CSC-1980 1263274 TREVOR KAMIMURA 78 77 93
ADDRECORD CSC-1980 1263749 CLASSIE LOURENCO 64 53 88
ADDRECORD CSC-2100 1262971 FREDERICA HADDOCK 71 86 79
ADDRECORD CSC-3885 1265445 KLARA SWEELEY 95 98 75
ADDRECORD CSC-1980 1262073 MARVA COTTIER 98 95 70
ADDRECORD CSC-2100 1265744 IRENE VILLALOBOS 90 81 89
ADDRECORD CSC-1980 1266028 CYRIL ZEEMAN 82 100 100
ADDRECORD CSC-2100 1262954 LANNY HABERKAMP 84 90 90
DELETERECORD 1262495
ADDRECORD CSC-2100 1264817 DARLINE REVELS 70 71 71
ADDRECORD CSC-2280 1261420 ELLYN BELONGER 94 88 83
ADDRECORD CSC-2280 1264543 NETTIE PETROVICH 75 97 94
ADDRECORD CSC-1980 1261284 ROOSEVELT ASTARITA 70 84 81
ADDRECORD CSC-1980 1265041 WINONA SCHLICHTING 95 91 86
DELETERECORD 1263274
ADDRECORD CSC-2100 1263174 FELICA ITNYRE 70 99 70
ADDRECORD CSC-2100 1261697 FLORETTA BRIDGES 74 100 16
DISPLAYSTATS CSC-1980
DISPLAYSTATS ALL
DISPLAYSTATS CSC-1980
ADDRECORD CSC-1980 1263701 FRANKLIN LOCKEMER 74 73 78
ADDRECORD CSC-2280 1265908 TESS WILLEMSEN 99 84 85
DISPLAYSTATS CSC-2100
ADDRECORD CSC-1980 1265552 ZORAIDA TIMMEL 77 56 20
ADDRECORD CSC-1980 1262354 ROBBYN DOM 79 97 97
DISPLAYSTATS ALL
ADDRECORD CSC-2280 1262978 REGAN HALMAN 89 80 93
ADDRECORD CSC-2280 1264780 IDELLA REIBERT 70 71 74
ADDRECORD CSC-2100 1264271 DEMARCUS NAEGELI 99 79 71
ADDRECORD CSC-2280 1262186 ELSE DAGLEY 82 74 89
ADDRECORD CSC-2100 1264939 LAURENCE RUVOLO 80 78 79
DELETERECORD 1265552
ADDRECORD CSC-2100 1263518 TED LAGE 80 91 84
ADDRECORD CSC-2100 1262300 HEIDY DEROSSO 95 85 96
DISPLAYSTATS ALL
DISPLAYSTATS ALL
ADDRECORD CSC-1980 1262027 DORCAS COLLAMORE 85 99 100
ADDRECORD CSC-1980 1263248 ARLYNE JUBIE 90 100 92
ADDRECORD CSC-2100 1264775 DELORES READNOUR 77 85 81
ADDRECORD CSC-2100 1262444 LANNIE DUFOUR 94 83 82
ADDRECORD CSC-3653 1261394 RAVEN BEGHTOL 93 91 72
ADDRECORD CSC-2280 1264107 LAILA MIMS 85 97 94
ADDRECORD CSC-2100 1262243 ELIZBETH DEBUSE 81 95 82
DELETERECORD 1263840
ADDRECORD CSC-2280 1261493 JAE BEYERSDORF 82 85 91
ADDRECORD CSC-2100 1261130 TAMMI AHALT 98 86 89
ADDRECORD CSC-2280 1265421 EDGARDO STROSNIDER 78 98 87
ADDRECORD CSC-2100 1262081 BERNIE COURCHESNE 78 82 81
DELETERECORD 1264780
DISPLAYSTATS CSC-1980
ADDRECORD CSC-2280 1265825 MICHIKO WANKER 95 73 97
ADDRECORD CSC-2100 1262917 CATHRYN GURNER 98 74 86
ADDRECORD CSC-2280 1264836 LAVERNE RITCHKO 89 98 96
DELETERECORD 1262954
ADDRECORD CSC-2100 1263310 KELI KELZER 29 75 79
DELETERECORD 1261394
ADDRECORD CSC-2280 1263994 KAYLA MCILTROT 87 79 70
ADDRECORD CSC-1980 1265199 ALBERTO SIVILAY 93 79 73
ADDRECORD CSC-2280 1264011 YOSHIKO MCKINNEY 73 97 73
ADDRECORD CSC-2280 1263903 TANIKA MARRINER 92 96 85
ADDRECORD CSC-2280 1261402 ANDREW BELCHIOR 97 87 89
ADDRECORD CSC-2280 1261136 CHAU AHARON 73 98 99
ADDRECORD CSC-1980 1264801 ANGELES RESPESS 72 87 96
DELETERECORD 1262917
DELETERECORD 1262444
DISPLAYSTATS CSC-2100
ADDRECORD CSC-2100 1265529 YI THOBEN 73 88 90
ADDRECORD CSC-2280 1263868 WADE MANTEY 19 39 23
ADDRECORD CSC-2280 1263708 GABRIELLE LOMINY 80 89 73
DELETERECORD 1264888
DELETERECORD 1261697
ADDRECORD CSC-2280 1265986 STUART YACOVONE 81 88 94
ADDRECORD CSC-1980 1265840 ELINA WARICK 47 1 10
ADDRECORD CSC-2280 1262259 MARYJANE DELONGE 33 83 69
ADDRECORD CSC-2100 1264724 JERROLD QUAKER 76 88 77
ADDRECORD CSC-1980 1261287 JOEANN AUST 90 84 100
ADDRECORD CSC-3957 1262479 STUART DZIAK 93 73 86
ADDRECORD CSC-1980 1266019 ISAIAH ZAGORSKI 89 100 96
ADDRECORD CSC-2692 1262994 LEONTINE HANKISON 92 97 95
ADDRECORD CSC-2100 1263454 KITTY KOLKER 91 81 86
ADDRECORD CSC-2280 1264144 MITTIE MOCERI 79 50 80
ADDRECORD CSC-2100 1262749 ANNAMARIE GAGON 95 84 75
ADDRECORD CSC-2100 1263638 DEMETRICE LENZA 92 95 100
DELETERECORD 1263701
ADDRECORD CSC-1980 1266008 JAMI YOSHIHARA 76 77 82
ADDRECORD CSC-1980 1264668 MADELAINE PREE 73 88 73
DISPLAYSTATS CSC-2280
DELETERECORD 1262300
ADDRECORD CSC-2100 1265833 BO WARHOLA 73 99 100
DELETERECORD 1263749
DISPLAYSTATS CSC-1980
DISPLAYSTATS CSC-2100
DISPLAYSTATS CSC-2280
QUIT

Welcome to the FSC Grade Book.

The following course(s) have been added to the database:
	CSC-1980
	CSC-2100
	CSC-2280

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 0
	Average Score: 0.00
	Highest Score: 0.00
	Lowest Score:  0.00
	Total 'A' Grades: 0 (0.00% of class)
	Total 'B' Grades: 0 (0.00% of class)
	Total 'C' Grades: 0 (0.00% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: DISPLAYSTATS (ALL)
Statistical Results for All Courses:
	Total number of student records: 0
	Average Score: 0.00
	Highest Score: 0.00
	Lowest Score:  0.00
	Total 'A' Grades: 0 (0.00% of class)
	Total 'B' Grades: 0 (0.00% of class)
	Total 'C' Grades: 0 (0.00% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 0
	Average Score: 0.00
	Highest Score: 0.00
	Lowest Score:  0.00
	Total 'A' Grades: 0 (0.00% of class)
	Total 'B' Grades: 0 (0.00% of class)
	Total 'C' Grades: 0 (0.00% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 0
	Average Score: 0.00
	Highest Score: 0.00
	Lowest Score:  0.00
	Total 'A' Grades: 0 (0.00% of class)
	Total 'B' Grades: 0 (0.00% of class)
	Total 'C' Grades: 0 (0.00% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: ADDRECORD
	ERROR: cannot add student. Course "CSC-4076" does not exist.

Command: DELETERECORD
	ERROR: cannot delete student. ID# 1265902 does not exist.

Command: ADDRECORD
	MOHAMED DUBBERLY (ID# 1262428) has been added to CSC-2280.
	Final Grade: 92.60 (A).

Command: DELETERECORD
	MOHAMED DUBBERLY (ID# 1262428) has been deleted from CSC-2280.

Command: ADDRECORD
	JOHNNA MOZELAK (ID# 1264229) has been added to CSC-2100.
	Final Grade: 47.10 (F).

Command: ADDRECORD
	ROXANA YETZER (ID# 1266004) has been added to CSC-1980.
	Final Grade: 79.30 (C).

Command: ADDRECORD
	HILTON DESHAIES (ID# 1262308) has been added to CSC-2100.
	Final Grade: 55.50 (F).

Command: ADDRECORD
	JOAQUINA BREAZEAL (ID# 1261683) has been added to CSC-2280.
	Final Grade: 43.10 (F).

Command: ADDRECORD
	BENNETT ROSSEY (ID# 1264888) has been added to CSC-2280.
	Final Grade: 81.40 (B).

Command: DELETERECORD
	JOHNNA MOZELAK (ID# 1264229) has been deleted from CSC-2100.

Command: ADDRECORD
	SAVANNAH BROWNIE (ID# 1261740) has been added to CSC-1980.
	Final Grade: 90.30 (A).

Command: ADDRECORD
	TANA MANDIGO (ID# 1263840) has been added to CSC-2280.
	Final Grade: 73.00 (C).

Command: ADDRECORD
	EARNEST LAWCEWICZ (ID# 1263582) has been added to CSC-2280.
	Final Grade: 91.70 (A).

Command: DELETERECORD
	HILTON DESHAIES (ID# 1262308) has been deleted from CSC-2100.

Command: ADDRECORD
	JERE WAHLER (ID# 1265786) has been added to CSC-1980.
	Final Grade: 79.50 (C).

Command: ADDRECORD
	ARCELIA BAILLY (ID# 1261320) has been added to CSC-2280.
	Final Grade: 79.90 (C).

Command: DELETERECORD
	SAVANNAH BROWNIE (ID# 1261740) has been deleted from CSC-1980.

Command: ADDRECORD
	SHAMIKA CATCHINGS (ID# 1261897) has been added to CSC-2280.
	Final Grade: 13.10 (F).

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 2
	Average Score: 79.40
	Highest Score: 79.50
	Lowest Score:  79.30
	Total 'A' Grades: 0 (0.00% of class)
	Total 'B' Grades: 0 (0.00% of class)
	Total 'C' Grades: 2 (100.00% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: ADDRECORD
	OPHELIA BELTRE (ID# 1261422) has been added to CSC-2100.
	Final Grade: 87.50 (B).

Command: ADDRECORD
	ARTHUR EIMER (ID# 1262495) has been added to CSC-1980.
	Final Grade: 60.50 (D).

Command: ADDRECORD
	CARMEL ELIASON (ID# 1262519) has been added to CSC-2100.
	Final Grade: 93.70 (A).

Command: DISPLAYSTATS (CSC-2280)
Statistical Results of CSC-2280:
	Total number of student records: 6
	Average Score: 63.70
	Highest Score: 91.70
	Lowest Score:  13.10
	Total 'A' Grades: 1 (16.67% of class)
	Total 'B' Grades: 1 (16.67% of class)
	Total 'C' Grades: 2 (33.33% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 2 (33.33% of class)

Command: ADDRECORD
	KRISTLE SCHOPPE (ID# 1265055) has been added to CSC-2100.
	Final Grade: 75.70 (C).

Command: ADDRECORD
	ELENOR SHEROD (ID# 1265126) has been added to CSC-2280.
	Final Grade: 92.30 (A).

Command: DELETERECORD
	KRISTLE SCHOPPE (ID# 1265055) has been deleted from CSC-2100.

Command: ADDRECORD
	TREVOR KAMIMURA (ID# 1263274) has been added to CSC-1980.
	Final Grade: 83.70 (B).

Command: ADDRECORD
	CLASSIE LOURENCO (ID# 1263749) has been added to CSC-1980.
	Final Grade: 70.30 (C).

Command: ADDRECORD
	FREDERICA HADDOCK (ID# 1262971) has been added to CSC-2100.
	Final Grade: 78.70 (C).

Command: ADDRECORD
	ERROR: cannot add student. Course "CSC-3885" does not exist.

Command: ADDRECORD
	MARVA COTTIER (ID# 1262073) has been added to CSC-1980.
	Final Grade: 85.90 (B).

Command: ADDRECORD
	IRENE VILLALOBOS (ID# 1265744) has been added to CSC-2100.
	Final Grade: 86.90 (B).

Command: ADDRECORD
	CYRIL ZEEMAN (ID# 1266028) has been added to CSC-1980.
	Final Grade: 94.60 (A).

Command: ADDRECORD
	LANNY HABERKAMP (ID# 1262954) has been added to CSC-2100.
	Final Grade: 88.20 (B).

Command: DELETERECORD
	ARTHUR EIMER (ID# 1262495) has been deleted from CSC-1980.

Command: ADDRECORD
	DARLINE REVELS (ID# 1264817) has been added to CSC-2100.
	Final Grade: 70.70 (C).

Command: ADDRECORD
	ELLYN BELONGER (ID# 1261420) has been added to CSC-2280.
	Final Grade: 87.80 (B).

Command: ADDRECORD
	NETTIE PETROVICH (ID# 1264543) has been added to CSC-2280.
	Final Grade: 89.20 (B).

Command: ADDRECORD
	ROOSEVELT ASTARITA (ID# 1261284) has been added to CSC-1980.
	Final Grade: 78.60 (C).

Command: ADDRECORD
	WINONA SCHLICHTING (ID# 1265041) has been added to CSC-1980.
	Final Grade: 90.20 (A).

Command: DELETERECORD
	TREVOR KAMIMURA (ID# 1263274) has been deleted from CSC-1980.

Command: ADDRECORD
	FELICA ITNYRE (ID# 1263174) has been added to CSC-2100.
	Final Grade: 78.70 (C).

Command: ADDRECORD
	FLORETTA BRIDGES (ID# 1261697) has been added to CSC-2100.
	Final Grade: 58.60 (F).

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 7
	Average Score: 82.63
	Highest Score: 94.60
	Lowest Score:  70.30
	Total 'A' Grades: 2 (28.57% of class)
	Total 'B' Grades: 1 (14.29% of class)
	Total 'C' Grades: 4 (57.14% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: DISPLAYSTATS (ALL)
Statistical Results for All Courses:
	Total number of student records: 24
	Average Score: 78.04
	Highest Score: 94.60
	Lowest Score:  13.10
	Total 'A' Grades: 5 (20.83% of class)
	Total 'B' Grades: 7 (29.17% of class)
	Total 'C' Grades: 9 (37.50% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 3 (12.50% of class)

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 7
	Average Score: 82.63
	Highest Score: 94.60
	Lowest Score:  70.30
	Total 'A' Grades: 2 (28.57% of class)
	Total 'B' Grades: 1 (14.29% of class)
	Total 'C' Grades: 4 (57.14% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: ADDRECORD
	FRANKLIN LOCKEMER (ID# 1263701) has been added to CSC-1980.
	Final Grade: 75.30 (C).

Command: ADDRECORD
	TESS WILLEMSEN (ID# 1265908) has been added to CSC-2280.
	Final Grade: 88.90 (B).

Command: DISPLAYSTATS (CSC-2100)
Statistical Results of CSC-2100:
	Total number of student records: 8
	Average Score: 80.38
	Highest Score: 93.70
	Lowest Score:  58.60
	Total 'A' Grades: 1 (12.50% of class)
	Total 'B' Grades: 3 (37.50% of class)
	Total 'C' Grades: 3 (37.50% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 1 (12.50% of class)

Command: ADDRECORD
	ZORAIDA TIMMEL (ID# 1265552) has been added to CSC-1980.
	Final Grade: 47.90 (F).

Command: ADDRECORD
	ROBBYN DOM (ID# 1262354) has been added to CSC-1980.
	Final Grade: 91.60 (A).

Command: DISPLAYSTATS (ALL)
Statistical Results for All Courses:
	Total number of student records: 28
	Average Score: 77.74
	Highest Score: 94.60
	Lowest Score:  13.10
	Total 'A' Grades: 6 (21.43% of class)
	Total 'B' Grades: 8 (28.57% of class)
	Total 'C' Grades: 10 (35.71% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 4 (14.29% of class)

Command: ADDRECORD
	REGAN HALMAN (ID# 1262978) has been added to CSC-2280.
	Final Grade: 87.90 (B).

Command: ADDRECORD
	IDELLA REIBERT (ID# 1264780) has been added to CSC-2280.
	Final Grade: 71.90 (C).

Command: ADDRECORD
	DEMARCUS NAEGELI (ID# 1264271) has been added to CSC-2100.
	Final Grade: 81.80 (B).

Command: ADDRECORD
	ELSE DAGLEY (ID# 1262186) has been added to CSC-2280.
	Final Grade: 82.40 (B).

Command: ADDRECORD
	LAURENCE RUVOLO (ID# 1264939) has been added to CSC-2100.
	Final Grade: 79.00 (C).

Command: DELETERECORD
	ZORAIDA TIMMEL (ID# 1265552) has been deleted from CSC-1980.

Command: ADDRECORD
	TED LAGE (ID# 1263518) has been added to CSC-2100.
	Final Grade: 84.90 (B).

Command: ADDRECORD
	HEIDY DEROSSO (ID# 1262300) has been added to CSC-2100.
	Final Grade: 92.40 (A).

Command: DISPLAYSTATS (ALL)
Statistical Results for All Courses:
	Total number of student records: 34
	Average Score: 79.68
	Highest Score: 94.60
	Lowest Score:  13.10
	Total 'A' Grades: 7 (20.59% of class)
	Total 'B' Grades: 12 (35.29% of class)
	Total 'C' Grades: 12 (35.29% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 3 (8.82% of class)

Command: DISPLAYSTATS (ALL)
Statistical Results for All Courses:
	Total number of student records: 34
	Average Score: 79.68
	Highest Score: 94.60
	Lowest Score:  13.10
	Total 'A' Grades: 7 (20.59% of class)
	Total 'B' Grades: 12 (35.29% of class)
	Total 'C' Grades: 12 (35.29% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 3 (8.82% of class)

Command: ADDRECORD
	DORCAS COLLAMORE (ID# 1262027) has been added to CSC-1980.
	Final Grade: 95.20 (A).

Command: ADDRECORD
	ARLYNE JUBIE (ID# 1263248) has been added to CSC-1980.
	Final Grade: 93.80 (A).

Command: ADDRECORD
	DELORES READNOUR (ID# 1264775) has been added to CSC-2100.
	Final Grade: 81.00 (B).

Command: ADDRECORD
	LANNIE DUFOUR (ID# 1262444) has been added to CSC-2100.
	Final Grade: 85.90 (B).

Command: ADDRECORD
	ERROR: cannot add student. Course "CSC-3653" does not exist.

Command: ADDRECORD
	LAILA MIMS (ID# 1264107) has been added to CSC-2280.
	Final Grade: 92.20 (A).

Command: ADDRECORD
	ELIZBETH DEBUSE (ID# 1262243) has been added to CSC-2100.
	Final Grade: 85.60 (B).

Command: DELETERECORD
	TANA MANDIGO (ID# 1263840) has been deleted from CSC-2280.

Command: ADDRECORD
	JAE BEYERSDORF (ID# 1261493) has been added to CSC-2280.
	Final Grade: 86.50 (B).

Command: ADDRECORD
	TAMMI AHALT (ID# 1261130) has been added to CSC-2100.
	Final Grade: 90.80 (A).

Command: ADDRECORD
	EDGARDO STROSNIDER (ID# 1265421) has been added to CSC-2280.
	Final Grade: 87.60 (B).

Command: ADDRECORD
	BERNIE COURCHESNE (ID# 1262081) has been added to CSC-2100.
	Final Grade: 80.40 (B).

Command: DELETERECORD
	IDELLA REIBERT (ID# 1264780) has been deleted from CSC-2280.

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 11
	Average Score: 84.94
	Highest Score: 95.20
	Lowest Score:  70.30
	Total 'A' Grades: 5 (45.45% of class)
	Total 'B' Grades: 1 (9.09% of class)
	Total 'C' Grades: 5 (45.45% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: ADDRECORD
	MICHIKO WANKER (ID# 1265825) has been added to CSC-2280.
	Final Grade: 89.20 (B).

Command: ADDRECORD
	CATHRYN GURNER (ID# 1262917) has been added to CSC-2100.
	Final Grade: 86.00 (B).

Command: ADDRECORD
	LAVERNE RITCHKO (ID# 1264836) has been added to CSC-2280.
	Final Grade: 94.50 (A).

Command: DELETERECORD
	LANNY HABERKAMP (ID# 1262954) has been deleted from CSC-2100.

Command: ADDRECORD
	KELI KELZER (ID# 1263310) has been added to CSC-2100.
	Final Grade: 62.80 (D).

Command: DELETERECORD
	ERROR: cannot delete student. ID# 1261394 does not exist.

Command: ADDRECORD
	KAYLA MCILTROT (ID# 1263994) has been added to CSC-2280.
	Final Grade: 77.80 (C).

Command: ADDRECORD
	ALBERTO SIVILAY (ID# 1265199) has been added to CSC-1980.
	Final Grade: 80.80 (B).

Command: ADDRECORD
	YOSHIKO MCKINNEY (ID# 1264011) has been added to CSC-2280.
	Final Grade: 80.20 (B).

Command: ADDRECORD
	TANIKA MARRINER (ID# 1263903) has been added to CSC-2280.
	Final Grade: 90.40 (A).

Command: ADDRECORD
	ANDREW BELCHIOR (ID# 1261402) has been added to CSC-2280.
	Final Grade: 90.80 (A).

Command: ADDRECORD
	CHAU AHARON (ID# 1261136) has been added to CSC-2280.
	Final Grade: 90.90 (A).

Command: ADDRECORD
	ANGELES RESPESS (ID# 1264801) has been added to CSC-1980.
	Final Grade: 86.10 (B).

Command: DELETERECORD
	CATHRYN GURNER (ID# 1262917) has been deleted from CSC-2100.

Command: DELETERECORD
	LANNIE DUFOUR (ID# 1262444) has been deleted from CSC-2100.

Command: DISPLAYSTATS (CSC-2100)
Statistical Results of CSC-2100:
	Total number of student records: 16
	Average Score: 80.84
	Highest Score: 93.70
	Lowest Score:  58.60
	Total 'A' Grades: 3 (18.75% of class)
	Total 'B' Grades: 7 (43.75% of class)
	Total 'C' Grades: 4 (25.00% of class)
	Total 'D' Grades: 1 (6.25% of class)
	Total 'F' Grades: 1 (6.25% of class)

Command: ADDRECORD
	YI THOBEN (ID# 1265529) has been added to CSC-2100.
	Final Grade: 84.30 (B).

Command: ADDRECORD
	WADE MANTEY (ID# 1263868) has been added to CSC-2280.
	Final Grade: 26.60 (F).

Command: ADDRECORD
	GABRIELLE LOMINY (ID# 1263708) has been added to CSC-2280.
	Final Grade: 79.90 (C).

Command: DELETERECORD
	BENNETT ROSSEY (ID# 1264888) has been deleted from CSC-2280.

Command: DELETERECORD
	FLORETTA BRIDGES (ID# 1261697) has been deleted from CSC-2100.

Command: ADDRECORD
	STUART YACOVONE (ID# 1265986) has been added to CSC-2280.
	Final Grade: 88.30 (B).

Command: ADDRECORD
	ELINA WARICK (ID# 1265840) has been added to CSC-1980.
	Final Grade: 18.40 (F).

Command: ADDRECORD
	MARYJANE DELONGE (ID# 1262259) has been added to CSC-2280.
	Final Grade: 62.40 (D).

Command: ADDRECORD
	JERROLD QUAKER (ID# 1264724) has been added to CSC-2100.
	Final Grade: 80.00 (B).

Command: ADDRECORD
	JOEANN AUST (ID# 1261287) has been added to CSC-1980.
	Final Grade: 92.20 (A).

Command: ADDRECORD
	ERROR: cannot add student. Course "CSC-3957" does not exist.

Command: ADDRECORD
	ISAIAH ZAGORSKI (ID# 1266019) has been added to CSC-1980.
	Final Grade: 95.10 (A).

Command: ADDRECORD
	ERROR: cannot add student. Course "CSC-2692" does not exist.

Command: ADDRECORD
	KITTY KOLKER (ID# 1263454) has been added to CSC-2100.
	Final Grade: 86.00 (B).

Command: ADDRECORD
	MITTIE MOCERI (ID# 1264144) has been added to CSC-2280.
	Final Grade: 70.70 (C).

Command: ADDRECORD
	ANNAMARIE GAGON (ID# 1262749) has been added to CSC-2100.
	Final Grade: 83.70 (B).

Command: ADDRECORD
	DEMETRICE LENZA (ID# 1263638) has been added to CSC-2100.
	Final Grade: 96.10 (A).

Command: DELETERECORD
	FRANKLIN LOCKEMER (ID# 1263701) has been deleted from CSC-1980.

Command: ADDRECORD
	JAMI YOSHIHARA (ID# 1266008) has been added to CSC-1980.
	Final Grade: 78.70 (C).

Command: ADDRECORD
	MADELAINE PREE (ID# 1264668) has been added to CSC-1980.
	Final Grade: 77.50 (C).

Command: DISPLAYSTATS (CSC-2280)
Statistical Results of CSC-2280:
	Total number of student records: 25
	Average Score: 78.57
	Highest Score: 94.50
	Lowest Score:  13.10
	Total 'A' Grades: 7 (28.00% of class)
	Total 'B' Grades: 10 (40.00% of class)
	Total 'C' Grades: 4 (16.00% of class)
	Total 'D' Grades: 1 (4.00% of class)
	Total 'F' Grades: 3 (12.00% of class)

Command: DELETERECORD
	HEIDY DEROSSO (ID# 1262300) has been deleted from CSC-2100.

Command: ADDRECORD
	BO WARHOLA (ID# 1265833) has been added to CSC-2100.
	Final Grade: 91.60 (A).

Command: DELETERECORD
	CLASSIE LOURENCO (ID# 1263749) has been deleted from CSC-1980.

Command: DISPLAYSTATS (CSC-1980)
Statistical Results of CSC-1980:
	Total number of student records: 16
	Average Score: 82.34
	Highest Score: 95.20
	Lowest Score:  18.40
	Total 'A' Grades: 7 (43.75% of class)
	Total 'B' Grades: 3 (18.75% of class)
	Total 'C' Grades: 5 (31.25% of class)
	Total 'D' Grades: 0 (0.00% of class)
	Total 'F' Grades: 1 (6.25% of class)

Command: DISPLAYSTATS (CSC-2100)
Statistical Results of CSC-2100:
	Total number of student records: 20
	Average Score: 83.21
	Highest Score: 96.10
	Lowest Score:  62.80
	Total 'A' Grades: 4 (20.00% of class)
	Total 'B' Grades: 11 (55.00% of class)
	Total 'C' Grades: 4 (20.00% of class)
	Total 'D' Grades: 1 (5.00% of class)
	Total 'F' Grades: 0 (0.00% of class)

Command: DISPLAYSTATS (CSC-2280)
Statistical Results of CSC-2280:
	Total number of student records: 25
	Average Score: 78.57
	Highest Score: 94.50
	Lowest Score:  13.10
	Total 'A' Grades: 7 (28.00% of class)
	Total 'B' Grades: 10 (40.00% of class)
	Total 'C' Grades: 4 (16.00% of class)
	Total 'D' Grades: 1 (4.00% of class)
	Total 'F' Grades: 3 (12.00% of class)

Thank you for using the the FSC Grade Book.

Goodbye.
