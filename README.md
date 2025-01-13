
# Movie API

The Movie API is a Spring Boot backend application designed to perform CRUD operations on a MongoDB database. It enables seamless management of movie records, including adding, updating, and deleting entries. Additionally, it facilitates user interaction by providing a feature to rate movies, enhancing the overall user experience and data functionality.

## Table of Contents
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [MongoDB Set up](#mongodb-set-up)
- [Installation](#installation)
- [Contributing](#contributing)
- [License](#license)

## Tech Stack
- SpringBoot
- MongoDB
  
## Prerequisites
1. **Ensure Maven is installed:**
   Verify Maven is installed and added to the `PATH`.
   - Run: `mvn -v`
   - If you see Maven's version details, it's correctly installed.

2. **Ensure JDK is installed:**
   Maven requires JDK. Verify with:
   - Run: `java -version`

3. **Navigate to the project directory:**
   Open Command Prompt and navigate to the directory containing your Maven project (`pom.xml` file).

## MongoDB Set up

- **Windows**
1. Download MongoDB Community Server from [MongoDB's official website](https://www.mongodb.com/try/download/community).
2. Run the installer and follow the instructions:
   - Choose "Complete" installation for default settings.
   - Install MongoDB Compass for a graphical interface (optional).
3. Add MongoDB's bin directory to your system’s PATH variable:
   - Example: `C:\Program Files\MongoDB\Server\<version>\bin`

- **macOS**
1. Install Homebrew if not already installed:
   ```bash
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
2. Install MongoDB using Homebrew:
   ```bash
   brew tap mongodb/brew
   brew install mongodb-community
   ```

- **Linux**
1. Import MongoDB's public GPG key:
   ```bash
   wget -qO - https://www.mongodb.org/static/pgp/server-6.0.asc | sudo apt-key add -
   ```
2. Add the MongoDB repository:
   ```bash
   echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/6.0 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-6.0.list
   ```
3. Update the package database and install MongoDB:
   ```bash
   sudo apt update
   sudo apt install -y mongodb-org
   ```

---

### 2. Start MongoDB

#### **Windows**
- Start MongoDB as a service:
  1. Open `services.msc`, find `MongoDB`, and start it.
  2. Alternatively, start it manually:
     ```bash
     mongod
     ```

#### **macOS/Linux**
- Start MongoDB:
  ```bash
  brew services start mongodb/brew/mongodb-community
  # OR on Linux
  sudo systemctl start mongod
  ```

---

### 3. Verify Installation

To confirm MongoDB is running, use the Mongo shell:
```bash
mongo
```
You should see a prompt indicating that you are connected to the Mongo shell.

---

### 4. Create a Database

1. Open the Mongo shell:
   ```bash
   mongo
   ```
2. Switch to (or create) a database:
   ```bash
   use myDatabase
   ```
   Replace `myDatabase` with your desired database name.
3. Insert a document to create the database:
   ```bash
   db.myCollection.insertOne({ name: "Test", type: "Example" })
   ```

---

## Installation
### Steps to Run the project in Popular IDEs
#### **1. IntelliJ IDEA**
1. **Import the Maven Project:**
   - Open IntelliJ IDEA.
   - Click on **File > Open**, and select the project folder containing the `pom.xml`.
   - IntelliJ will automatically detect the Maven project and import it.

2. **Build the Project:**
   - Open the **Maven tool window** (usually on the right-hand side).
   - Click on the **Reload All Maven Projects** button (🔄) to ensure dependencies are downloaded.
   - Build the project by clicking **Lifecycle > install** or **Lifecycle > package**.

3. **Run the Project:**
   - Locate the main class (`public static void main(String[] args)`).
   - Right-click the main class file and select **Run 'Main'**.


#### **2. Eclipse IDE**
1. **Import the Maven Project:**
   - Open Eclipse.
   - Go to **File > Import > Maven > Existing Maven Projects**.
   - Browse to the project folder and click **Finish**.

2. **Build the Project:**
   - Right-click the project in the **Project Explorer**.
   - Select **Run As > Maven install** or **Maven build** (then specify the goal, e.g., `clean install`).

3. **Run the Project:**
   - Locate the main class (`public static void main(String[] args)`).
   - Right-click the main class file and select **Run As > Java Application**.

#### **3. Visual Studio Code**
1. **Install Required Extensions:**
   - Install the **Maven for Java** and **Debugger for Java** extensions.

2. **Open the Project:**
   - Open VS Code.
   - Navigate to the folder containing the `pom.xml` file.

3. **Build the Project:**
   - Open the **Terminal** (`Ctrl + ~`), and run:
     ```bash
     mvn clean install
     ```

4. **Run the Project:**
   - Locate the main class in the **Explorer**.
   - Right-click the main class and select **Run Java**.

#### **4. NetBeans IDE**
1. **Open the Project:**
   - Open NetBeans.
   - Go to **File > Open Project**, and select the folder containing the `pom.xml`.

2. **Build the Project:**
   - Right-click the project in the **Projects** window.
   - Select **Build with Dependencies**.

3. **Run the Project:**
   - Right-click the main class file and select **Run File**.

Each IDE has specific Maven support, but these general steps should work.

### Steps to run the project in CMD

1. **Navigate to the project directory:**
   ```bash
   cd path\to\your\project
    ```

2. **Run the Maven install command:**
   ```bash
   mvn install
   ```
   - This compiles the code, runs tests, and installs the built artifact (e.g., `.jar` or `.war` file) to your local Maven repository (`~/.m2/repository`).

3. **Optional Parameters:**
   - Skip Tests:
     ```bash
     mvn install -DskipTests
     ```
   - Clean and Install:
     ```bash
     mvn clean install
     ```
     The `clean` command removes previous builds before installing the new one.

4. **Verify Installation:**
   - Check the `target` directory in your project for the generated files (e.g., `.jar` or `.war`).
   - Verify the artifact is installed in your local Maven repository (`~/.m2/repository`).

## Contributing

1. Fork the repository.
2. Create a new branch: `git checkout -b feature-name`.
3. Make your changes.
4. Push your branch: `git push origin feature-name`.
5. Create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
