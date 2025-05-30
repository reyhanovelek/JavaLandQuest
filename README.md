
# 🧙‍♂️ JavaLand: The Code Chronicles

Welcome to **JavaLand: The Code Chronicles**, a story-driven Java exercise series designed to make core Java concepts fun and practical. This README walks you through each task with context and instructions.

---

## 🎮 Story Introduction

You are a junior developer in **CodeVerse Corp**, tasked with building magical software tools for adventurers across JavaLand. Each task helps a hero and teaches you a key Java concept.

---

## 🧪 Tasks & Instructions

### 1. `PotionCalculator.java` – 🧮 Math Operations
**Story:** The wizard needs a tool to calculate how many full potions he can make with a given number of ingredient units.

**Task:**
- Write a method to calculate how many full potions can be made.
- Show remaining units using modulus (`%`).
- Optional: Add method to compute total cost of ingredients.

---

### 2. `SpellCostEstimator.java` – 🔧 Functions & Return Values
**Story:** Spell mana cost depends on the spell name and power level.

**Task:**
- Create a method `int calculateManaCost(String spellName, int powerLevel)`.
- Add another method to return a spell summary string.

---

### 3. `HeroEligibilityChecker.java` – 🔍 Logical & Boolean Operations
**Story:** Only heroes older than 18 and stronger than 70 can join the Guild.

**Task:**
- Use `&&`, `||`, and `!` to validate eligibility.
- Use a ternary operator to return `"Warrior"` or `"Apprentice"` based on experience.

---

### 4. `GuildGatekeeper.java` – 🧠 If-Else Statements
**Story:** Determine access rights for different hero types.

**Task:**
- Use `if-else` to check hero type:
  - Knight → Armory
  - Mage → Library
  - Else → Restricted

---

### 5. `DayScheduler.java` – 🧭 Switch Statement
**Story:** Assign magical activities based on day of the week.

**Task:**
- Use `switch-case` to return a string activity for a given day (1–7).

---

### 6. `DungeonSimulator.java` – 🔁 Loops
**Story:** The hero explores a dungeon to collect 100 gold.

**Task:**
- Use a `while` loop to simulate collecting gold until 100 is reached.
- Use a `for` loop to loop through dungeon rooms.
- Use a `do-while` loop to simulate 3 tries to open a chest.

---

### 7. `MagicInventory.java` – 📚 Java Collections
**Story:** Track a hero’s items, potions, and gold.

**Task:**
- Use `List` to store item names.
- Use `Set` to track unique potion types.
- Use `Map<String, Integer>` to store item quantities.

---

### 8. `Creature.java`, `Dragon.java`, `Goblin.java`, `Wizard.java` – 🔨 OOP
**Story:** JavaLand is full of creatures, each with different attacks.

**Task:**
- Define abstract class `Creature` with `void attack()`.
- Implement this method in `Dragon`, `Goblin`, and `Wizard`.
- Demonstrate polymorphism by storing creatures in a list and calling `attack()`.

---

### 9. `MagicBox.java` – 🧬 Generics & Exception Handling
**Story:** A magical box can store any type of item, but returns an error if accessed empty.

**Task:**
- Create a generic class `MagicBox<T>`.
- Add `set()` and `get()` methods.
- Throw a custom exception if the box is empty on `get()`.

---

### 10. `ScrollManager.java` – 💾 Java IO
**Story:** Read and write ancient spells from scrolls (files).

**Task:**
- Use `BufferedWriter` to write a list of spells to a file.
- Use `BufferedReader` to read and print each spell.
- Optional: Count number of spells.

---

### 11. `HeroDashboard.java` – 🏆 Final Project
**Story:** Build a console app for managing heroes, quests, and inventory.

**Task:**
- Use previous classes to:
  - Register and store heroes
  - Manage inventory
  - Handle eligibility checks and scheduling
  - Save/load data via IO

---

## ✅ How to Run

1. Start with `Main.java`
2. Uncomment and test each module.
3. Finish by integrating everything into `HeroDashboard`.

---

## 🧠 Bonus Challenges

- Add user input via `Scanner`
- Write unit tests using JUnit 5
- Save hero progress to a file
- Expand Creature hierarchy with `Elf`, `Orc`, etc.

---

**Happy coding, brave developer!** 🧝‍♂️  
*And remember: Java is a path to the dark side… 😉*
