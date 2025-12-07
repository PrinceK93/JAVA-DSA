# Upgrade to Java 21 (LTS)

JDK 21 has been installed at `C:\Users\princ\.jdk\jdk-21.0.8`.

Quick verification (already done):

```
C:\Users\princ\.jdk\jdk-21.0.8\bin\java -version
```

Set `JAVA_HOME` and update `PATH` for the current PowerShell session:

```powershell
$env:JAVA_HOME='C:\Users\princ\.jdk\jdk-21.0.8'
$env:Path='C:\Users\princ\.jdk\jdk-21.0.8\bin;'+$env:Path
java -version
```

Persisting the change for the current user (PowerShell): run as the user (no admin required):

```powershell
[Environment]::SetEnvironmentVariable('JAVA_HOME', 'C:\Users\princ\.jdk\jdk-21.0.8', 'User')
#$env:Path currently includes other entries; prepend JDK bin to the user PATH:
$userPath = [Environment]::GetEnvironmentVariable('Path', 'User')
[Environment]::SetEnvironmentVariable('Path', 'C:\Users\princ\.jdk\jdk-21.0.8\bin;' + $userPath, 'User')
```

After running the above, open a new PowerShell window and run:

```
java -version
```

Notes:
- If you use a build tool (Maven/Gradle), update its `JAVA_HOME` config or the wrapper properties as needed.
- This repo appears to be plain `.java` files without Maven/Gradle. No project file changes were necessary.

If you want, I can:
- Add a `build.gradle` or `pom.xml` to enable the automated upgrade tools.
- Configure project to compile with `--release 21` and run a quick compile check.
