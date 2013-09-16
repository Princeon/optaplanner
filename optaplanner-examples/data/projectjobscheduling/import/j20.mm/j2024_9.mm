************************************************************************
file with basedata            : md344_.bas
initial value random generator: 1775832261
************************************************************************
projects                      :  1
jobs (incl. supersource/sink ):  22
horizon                       :  160
RESOURCES
  - renewable                 :  2   R
  - nonrenewable              :  2   N
  - doubly constrained        :  0   D
************************************************************************
PROJECT INFORMATION:
pronr.  #jobs rel.date duedate tardcost  MPM-Time
    1     20      0       24       14       24
************************************************************************
PRECEDENCE RELATIONS:
jobnr.    #modes  #successors   successors
   1        1          3           2   3   4
   2        3          3           5   6  19
   3        3          3           7   9  10
   4        3          2           9  11
   5        3          1           9
   6        3          3          10  12  16
   7        3          3           8  13  15
   8        3          3          11  12  14
   9        3          1          14
  10        3          2          17  18
  11        3          1          21
  12        3          2          17  18
  13        3          2          19  20
  14        3          2          17  20
  15        3          3          16  19  21
  16        3          1          18
  17        3          1          21
  18        3          1          20
  19        3          1          22
  20        3          1          22
  21        3          1          22
  22        1          0        
************************************************************************
REQUESTS/DURATIONS:
jobnr. mode duration  R 1  R 2  N 1  N 2
------------------------------------------------------------------------
  1      1     0       0    0    0    0
  2      1     1       2   10    9    0
         2     3       1    7    7    0
         3     8       1    4    0    9
  3      1     3       9    2    7    0
         2     4       9    2    5    0
         3     5       7    2    0    7
  4      1     2      10    6    0    4
         2     5      10    5    0    4
         3    10      10    5    0    1
  5      1     6       6    9    9    0
         2     8       6    8    9    0
         3    10       6    7    9    0
  6      1     2       5    8    4    0
         2     4       4    6    0    8
         3     5       4    4    3    0
  7      1     4       7    9    7    0
         2     5       6    9    0    7
         3     8       6    9    0    3
  8      1     2       6    9    0    7
         2     2       7    7    0    9
         3     7       5    4    0    6
  9      1     5       9    4    0    5
         2     6       4    4    7    0
         3    10       2    3    7    0
 10      1     4      10    8    0    5
         2     7       9    7    0    4
         3     8       9    4    2    0
 11      1     7       8   10    0    9
         2     8       8    9    9    0
         3     9       7    8    0    2
 12      1     3       9    9    0    8
         2     5       8    9    8    0
         3     9       8    6    2    0
 13      1     2       5    6    7    0
         2     4       5    3    6    0
         3     8       3    3    0    5
 14      1     2       5    5    0    4
         2     3       4    5    4    0
         3    10       4    1    4    0
 15      1     4       5   10    0    2
         2     8       4   10    0    1
         3     9       3    9    3    0
 16      1     3       8    7    7    0
         2     4       7    7    0    4
         3     6       7    6    2    0
 17      1     9       6    8    0    7
         2    10       5    7    6    0
         3    10       4    7    0    6
 18      1     2       5    9    8    0
         2     3       5    5    0    5
         3     9       5    5    8    0
 19      1     1       7    9    8    0
         2     5       5    6    0    1
         3    10       4    5    5    0
 20      1     1       6    8    0    8
         2     5       4    7    8    0
         3     7       2    5    0    7
 21      1     1       5    7    4    0
         2     2       4    6    4    0
         3     2       5    5    0    5
 22      1     0       0    0    0    0
************************************************************************
RESOURCEAVAILABILITIES:
  R 1  R 2  N 1  N 2
   41   39   90   86
************************************************************************