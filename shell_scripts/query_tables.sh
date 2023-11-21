#!/bin/sh

function pause(){
  read -p "$*"
  }
  
export LD_LIBRARY_PATH=/usr/lib/oracle/12.1/client64/lib



echo '1. Query 1: Calculate the total overtime hours worked and the average rate multiplier for each HR Manager:'
echo '2. Query 2: List all employees who have a bonus greater than 400 dollars:'
echo '3. Query 3: Calculate the combined average of Canadian Pension Plan and Employee Insurance to find how much is taken out of an employee on average:'
echo '4. Query 4: Find all the gross pays in the SALARY table that are not the highest or lowest:'
echo '5. Query 5: Selects all employee IDs that are in the Employee table but not in the Full_Time_Employee table:'
echo "6. Query 6: Find employees who have received gross pay but haven't received any vacation pay:"


read input

if [ "$input" = "1" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query1.txt
echo "Query 1 Performed"
pause

elif [ "$input" = "2" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query2.txt
echo "Query 2 Performed"
pause

elif [ "$input" = "3" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query3.txt
echo "Query 3 Performed"
pause

elif [ "$input" = "4" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query4.txt
echo "Query 4 Performed"
pause

elif [ "$input" = "5" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query5.txt
echo "Query 5 Performed"
pause

elif [ "$input" = "6" ]; then
sqlplus64 "eyilmaz/07238034@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(Host=oracle.scs.ryerson.ca)(Port=1521))(CONNECT_DATA=(SID=orcl)))" < ./query6.txt
echo "Query 6 Performed"
pause

else
echo 'Invalid Input'
fi