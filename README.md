# In this project.

1. We have used spring-security, spring-data-jpa and mysql for validating user from database.
2. Schema Used is:
```
CREATE TABLE `user`(
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(50) DEFAULT NULL,
  `password` VARCHAR(50) NOT NULL,
  `roles` VARCHAR(50) NOT NULL,
  `active` BOOL NOT NULL,
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB
--
-- Data: user
--
INSERT INTO `user` VALUES
    (1, 'amit', 'amit', 'ROLE_USER', TRUE),
    (2, 'admin', 'admin', 'ROLE_ADMIN', TRUE);

```

