create table ITEMS
(
    ITEM_ID bigint auto_increment
        primary key,
    NAME varchar(50) not null,
    PRICE double(7,2) not null,
    TOTAL_QUANTITY int not null,
    CATEGORY varchar(50) null,
    DEFAULT_QUANTITY int not null,
    UNIT varchar(50) not null,
    BRAND varchar(50) null
);