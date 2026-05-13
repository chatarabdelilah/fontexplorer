# Analyse

---

## Productvisie

### 1. Product beschrijving

Fonts voor developers en designers die geinteresseerd zijn in typografie. Om het web en applicaties mooier te maken.

---

### 2. User story mapping

<img width="1802" height="1136" alt="image" src="https://github.com/user-attachments/assets/7023f209-55bc-465e-97d0-31e23da52959" />

#### Acceptance criteria

1. Als bezoeker wil ik alle fonts zien.
   - List pagina toont alle niet-gearchiveerde fonts.
   - Elk font toont naam en categorie.
   - De pagina is bereikbaar zonder in te loggen.
   - Elk font heeft een link naar detail pagina.
   - Geen fonts = melding
2. Als bezoeker wil ik detail pagina zien van een font.
   - Detail pagina toont naam, categorie, designer, jaar, licentie en stijlen.
   - Font bestaat niet of gearchiveerd = foutmelding op pagina (geen redirect).
   - Pagina bevat prev/next links
3. Als admin wil ik een nieuw font aanmaken via een formulier.
   - Formulier enkel bereikbaar voor admins.
   - Formulier bevat ```<select>``` met designers uit db.
   - Verplichte velden tonen foutmelding als ze leeg zijn (geen redirect, bvb. rode border).
   - Nieuwe font verschijnt meteen in font list.

---

### 3. Personas

#### Bezoeker - Lars Mertens
|||
|---|---|
| **Leeftijd** | 24 |
| **Beroep** | Freelance front-end developer |
| **Woonplaats** | Gent |
| **Bio** | Lars studeert grafische en digitale media af en bouwt nu zijn eerste freelance projecten op. Hij maakt websites voor lokale zelfstandigen en kleine bedrijven. Hij wil dat zijn sites er professioneel uitzien maar heeft geen formele achtergrond in typografie. |
| **Doelen** | Snel een font vinden dat past voor een specifiek project. Weten welke fonts vrij gebruik licentie hebben. CSS-code kopieren. |
| **Frustraties** | Google Fonts is overweldigend, te veel keuze, te weinig context. Hij weet niet welke fonts goed combineren. Veel tijd verloren aan zoeken. |
| **Relatie** | Browst de fontlijst, filtert op licentie of categorie. Wilt een account voor favorieten bij te houden per project. |

---

#### Gebruiker - Nathalie Claes
|||
|---|---|
| **Leeftijd** | 38 |
| **Beroep** | Grafisch ontwerper bij een communicatiebureau |
| **Woonplaats** | Antwerpen |
| **Bio** | Nathalie werkt al 12 jaar als grafisch ontwerper. Ze kent de klassiekers (Helvetica, Garamond, Futura) maar wil bewust nieuwe en minder bekende fonts ontdekken. Ze heeft gevoel voor typografische kwaliteit en let sterk op details zoals letterspatiëring en x-hoogte. |
| **Doelen** | Nieuwe fonts ontdekken. Fonts opslaan in collecties per project/klant. Snel beoordelen of een font geschikt is. |
| **Frustraties** | Veel fontwebsites tonen alleen standaardtekst in de preview, niet eigen tekst. Licentie informatie onduidelijk of verstopt. Ze wilt collecties maken maar geen zin in complexe tools. |
| **Relatie** | Filtert intensief op designer en jaar, en wilt fonts bewaren per klant in collecties. |

---

#### Bezoeker - Abdelilah Salim Chatar
|||
|---|---|
| **Leeftijd** | 20 |
| **Beroep** | Student IT Programmeren (1e jaar) |
| **Woonplaats | Antwerpen |
| **Bio** | Abdelilah begint net aan zijn project en ontdekt typografie ald discipline. Hij kent amper het verschil tussen serif en sans-serif maar in enthousiast en visueel ingesteld. Hij zoekt vooral inspiratie en wil leren door te kijken. |
| **Doelen** | Begrijpen wat de verschillen zijn tussen lettertypes. Inspiratie opdoen voor schoolopdrachten. Zien hoe een font eruitziet in een echte context. |
| **Frustraties** | Vakjargon dat hij niet begrijpt. Te veel technische info. Previews die klein of saai zijn. |
| **Relatie** | Browst zonder account, kijkt naar de lijst en detail paginas, klikt door op designers. |

---

#### Admin - Vera Peteghem
|||
|---|---|
| **Leeftijd** | 45 |
| **Beroep** | Typografie redacteur |
| **Woonplaats** | Leuven |
| **Bio** | Vera beheert het fontaanbod van de app. Grafische achtergrond, verantwoordelijk voor de kwaliteit en volledigheid van de font-database. |
| **Doelen** | Snel nieuwe fonts toevoegen, foutieve informatie corrigeren en onrelevante fonts archiveren zonder data te verliezen. |
| **Frustraties** | Foutieve koppelingen moeilijk terug te vinden. Wilt geen technische kennis hebben voor te beheren. |
| **Relatie** | Gebruikt admin gedeelte: fonts aanmaken, bewerken, archiveren en designers behren. |

---

## Conceptueel model

**Probleem definieren**

Q: Wat modelleren we?
<br/>
A: Een platform waar mensen lettertypes kunnen ontdekken en bewaren.

**Doelen:**
- Fonts vindbaar maken.
- Fonts koppelen aan hun maker.
- Gebruikers toelaten fonts te bewaren als favoriet.
- Admins toelaten fonts te beheren.

**Kernconcepten identificeren**

| Concept | Reden |
|---|---|
| **Font** | Het centrale object van het platform. |
| **Designer** | De persoon die een font gemaakt heeft. |
| **Gebruiker** | Iemand die fonts ontdekt en bewaart. |

Categorie, stijlen, tekensystemen -> weglaten op dit niveau, zijn extras.

**Relaties bepalen**

- Een designer maakt 1 of meerdere fonts.
- Een gebruiker bewaart meerdere fonts als favoriet.
- Een font kan door meerdere gebruikers bewaard worden.

**Visualisatie**

<img width="962" height="591" alt="image" src="https://github.com/user-attachments/assets/6022f895-4caf-47af-8b9d-eea3bd164576" />

---

## Functionele analyse

### Wireframes

<img width="1041" height="676" alt="image" src="https://github.com/user-attachments/assets/f775bbd9-c748-458f-814d-c7d3e08629a0" />

***Font list pagina***
> Lijst pagina van alle fonts. Toont een preview en categorie. Bevat een knop dat doorverwijst naar de detail pagina van geselecteerde font. Admin ziet een New-knop voor nieuwe fonts te voegen.

<img width="1036" height="674" alt="image" src="https://github.com/user-attachments/assets/3c3a8be3-8047-4521-96db-f5dc04d7798a" />

---

***Font details pagina***
> Detail pagina van een font. Toont alle eigenschappen: naam, categorie, jaar, designer (klikbaar, verwijst door naar detail pagina van gekoppelde designer), licentie en stijlen. Bevat navigatie knoppen naar vorige en volgende font. Admin ziet een Edit-knop voor een font aan te passen.

---

### Use case diagram

---

### Activity diagram

---

### Class diagram

---

### Sequence diagram ###

---

### State transition diagram

---

### ERD
