// Problem: The Report
// Link: https://www.hackerrank.com/challenges/the-report/problem?isFullScreen=true

SELECT
    case when g.grade >= 8 then s.name else 'NULL' end,
    g.Grade,
    s.Marks
From students s
join Grades g ON s.Marks BETWEEN g.Min_Mark and g.Max_Mark
order by g.grade desc,s.name,s.marks;