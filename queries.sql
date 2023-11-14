--Part 1
 DESCRIBE job;

--Part 2
--write a query to list the names of the employers in St. Louis City.
SELECT name
 FROM employer
 WHERE location = "St. Louis City";
--Part 3
--write the SQL statement to remove the job table.

DROP TABLE job;

--Part 4
--
SELECT * FROM skill
LEFT JOIN job_skills ON skill.id = job_skills.skills_id
WHERE job_skills.jobs_id IS NOT NULL
ORDER BY name ASC;
