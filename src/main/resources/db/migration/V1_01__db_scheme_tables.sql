-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS "public"."_user";
CREATE TABLE "public"."_user"
(
    id         bigserial primary key,
    "name"         varchar(255),
    "email"        varchar(255),
    "phone_number" varchar(255),
    "registration_date" timestamp(6)
)
;

-- ----------------------------
-- Table structure for user_membership_info
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_membership_info";
CREATE TABLE "public"."user_membership_info"
(
    id         bigserial
        primary key,
    "isActive"         boolean,
    "numberOfDays" integer,
    "activeBefore" timestamp(6),
    "user_id" bigint
);

ALTER TABLE "public"."user_membership_info" ADD CONSTRAINT "user_membership_info_user_id_fk" FOREIGN KEY ("user_id") REFERENCES "public"."_user" ("id") ON DELETE CASCADE ON UPDATE NO ACTION;