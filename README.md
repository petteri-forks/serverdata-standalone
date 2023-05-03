# Serverdata standalone

The serverdata application with local credentials (no Keycloak)

# Installation

* clone
* cd to directory
* create .env with desired settings (copy from .env-TEMPLATE and edit)
* docker compose up -d

The server will be listening in port 4000 by default

## Reverse proxy configuration

To expose the service with Apache, add following lines to Apache site configuration
````
        ProxyPass "/"  "http://localhost:4000/"
        ProxyPassReverse "/"  "http://localhost:4000/"
````
NOTE: unclear if you can use it with other URL than /

Restart Apache.
