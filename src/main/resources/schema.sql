-- Create User table
CREATE TABLE "user" (
    "id" BIGINT AUTO_INCREMENT PRIMARY KEY,
    "username" VARCHAR(255) NOT NULL,
    "email" VARCHAR(255) NOT NULL,
    "password" VARCHAR(255) NOT NULL,
    "role" VARCHAR(50) NOT NULL
);

-- Create Task table
CREATE TABLE "task" (
    "id" BIGINT AUTO_INCREMENT PRIMARY KEY,
    "title" VARCHAR(255) NOT NULL,
    "description" TEXT,
    "priority" VARCHAR(50),
    "status" VARCHAR(50),
    "duedate" DATE,
    "assignee_id" BIGINT,
    FOREIGN KEY ("assignee_id") REFERENCES "user"("id")
);
