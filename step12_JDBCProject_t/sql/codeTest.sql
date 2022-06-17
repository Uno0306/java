SELECT * FROM donor;
SELECT * FROM recipient;
SELECT * FROM bt_project;

DESC donor;
DESC recipient;
DESC bt_project;

commit;

delete from bt_project where donor_id="donor3";