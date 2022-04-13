INSERT INTO user (id, username, password) VALUES
 (1, 'Mohamed', '$2a$12$50dgmB46idlf33O6C8w2gu46CBC870V1SS6QcC/iGiFy0ipFhA61K');
INSERT INTO role_group (id, role) VALUES (1, 'admin');
INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
