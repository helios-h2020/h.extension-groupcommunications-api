## Group Communications API

**h.extension-groupcommunications-api** contains the abstraction logic of the 
**h.extension-groupcommunications** module. 

### How to configure HELIOS dependencies through HELIOS Nexus

To manage project dependencies developed by HELIOS, the approach proposed is to use a private Maven
repository with Nexus.

Similar to other dependencies available in Maven Central, Google or others repositories, we
specify the Nexus repository provided by ATOS: `https://builder.helios-social.eu/repository
/helios-repository/`

This URL makes the project dependencies available.

To access, we simply need credentials, that we will define locally in the variables `heliosUser` and `heliosPassword`.

The `build.gradle` of the project define the Nexus repository and the credential variables in this way:

```
repositories {
        ...
        maven {
            url "https://builder.helios-social.eu/repository/helios-repository/"
            credentials {
                username = heliosUser
                password = heliosPassword
            }
        }
    }
```

And the variables of Nexus's credentials are stored locally at `~/.gradle/gradle.properties`:

And the variables of Nexus's credentials are stored locally at `~/.gradle/gradle.properties`:

```
heliosUser=username
heliosPassword=password
```

To request Nexus username and password, contact with: `jordi.hernandezv@atos.net`