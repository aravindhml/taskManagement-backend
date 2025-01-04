-- Insert Users
INSERT INTO "user" ("username", "email", "password", "role") 
VALUES ('admin', 'admin@example.com', '$2a$10$wI7w6P5GcS0X3qu8MwsNgeZtw7Bhh7tvDhZmFmyjiG7yq5AjaCSKu', 'ADMIN'); -- password: admin123

INSERT INTO "user" ("username", "email", "password", "role") 
VALUES ('john', 'john@example.com', '$2a$10$wI7w6P5GcS0X3qu8MwsNgeZtw7Bhh7tvDhZmFmyjiG7yq5AjaCSKu', 'USER'); -- password: john123

INSERT INTO "user" ("username", "email", "password", "role") 
VALUES ('alice', 'alice@example.com', '$2a$10$wI7w6P5GcS0X3qu8MwsNgeZtw7Bhh7tvDhZmFmyjiG7yq5AjaCSKu', 'USER'); -- password: alice123

-- Insert Tasks
INSERT INTO "task" ("title", "description", "priority", "status", "duedate", "assignee_id") 
VALUES ('Complete Sprint Report', 'Complete the sprint report for the upcoming meeting', 'HIGH', 'PENDING', '2025-01-10', 1);

INSERT INTO "task" ("title", "description", "priority", "status", "duedate", "assignee_id") 
VALUES ('Prepare Presentation', 'Prepare a presentation for the demo on Friday', 'MEDIUM', 'PENDING', '2025-01-08', 2);

INSERT INTO "task" ("title", "description", "priority", "status", "duedate", "assignee_id") 
VALUES ('Review Pull Request', 'Review the pull request from the team', 'LOW', 'PENDING', '2025-01-09', 3);

INSERT INTO "task" ("title", "description", "priority", "status", "duedate", "assignee_id") 
VALUES ('Fix Bug in Login', 'Fix the bug that prevents users from logging in', 'HIGH', 'PENDING', '2025-01-07', 1);
