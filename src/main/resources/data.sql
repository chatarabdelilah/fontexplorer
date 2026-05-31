-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- DESIGNERS
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO DESIGNER (name, email, bio, country, city) VALUES ('Erik Spiekermann', 'erik@spiekermann.de', 'Beroemde Duitse typograaf en grafisch ontwerper, oprichter van Meta Design.', 'Germany', 'Berlin');
INSERT INTO DESIGNER (name, email, bio, country, city) VALUES ('Zuzana Licko', 'zuzana@emigre.com', 'Medeoprichter van Emigre, pionier van digitale typografie.', 'USA', 'Berkeley');
INSERT INTO DESIGNER (name, email, bio, country, city) VALUES ('Matthew Carter', 'matthew@carterco.com', 'Brits typograaf, ontwerper van Verdana en Georgia.', 'UK', 'Cambridge');
INSERT INTO DESIGNER (name, email, bio, country, city) VALUES ('Tobias Frere-Jones', 'tobias@frerejones.com', 'Ontwerper van Gotham en Interstate, gevestigd in New York.', 'USA', 'New York');
INSERT INTO DESIGNER (name, email, bio, country, city) VALUES ('Cyrus Highsmith', 'cyrus@fontbureau.com', 'Lid van het Font Bureau, gespecialiseerd in tekst- en displaylettertypen.', 'USA', 'Boston');

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- FONTS
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Agatha Modern', 'Serif', 'SIL Open Font License', false, 2003, 1);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Tiempos', 'Sans Serif', 'SIL Open Font License', false, 2010, 2);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Quantum Mono', 'Monospace', null, false, 2015, 3);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Velocity Sans', 'Sans Serif', null, false, 2018, 4);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Ethereal Display', 'Display', 'SIL Open Font License', false, 2020, 5);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Brutal Grotesk', 'Sans Serif', 'SIL Open Font License', false, 2019, 1);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Heritage Sans', 'Display', 'SIL Open Font License', false, 2012, 2);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Avenue Sans', 'Serif', 'SIL Open Font License', false, 2008, 3);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Calyx Display', 'Cursive', 'SIL Open Font License', false, 2021, 4);
INSERT INTO FONT (name, category, license, archived, release_year, designer_id) VALUES ('Sodo Sans', 'Sans Serif', null, true, 2005, 5);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- APP USERS
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO APP_USER
(name, email, occupation, bio, country, city, logged_in)
VALUES
    ('Abdelilah', 'chatar.abdelilah.s@gmail.com', 'Student', 'IT Student', 'Belgium', 'Antwerp', TRUE);

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- FONT COLLECTIONS
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

INSERT INTO FONT_COLLECTION (name, description, owner_id) VALUES ('Web Project Fonts', 'Fonts voor een web project', 1);
INSERT INTO FONT_COLLECTION (name, description, owner_id) VALUES ('Blog Fonts', 'Fonts voor een blog', 1);
INSERT INTO FONT_COLLECTION (name, description, owner_id) VALUES ('Programming Fonts', 'Fonts voor visual studio code', 1);
INSERT INTO FONT_COLLECTION (name, description, owner_id) VALUES ('Game Fonts', 'Fonts voor een game', 1);
INSERT INTO FONT_COLLECTION (name, description, owner_id) VALUES ('Favorite fonts', 'Mijn favoriete fonts in 1', 1);