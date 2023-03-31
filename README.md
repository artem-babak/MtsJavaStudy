# MtsJavaStudy
Java study repo for MTSB.

## Docker DB init
Note: Use your local preferences.
```shell
docker run `
--name postgres `
-v c:\Git\MtsJavaStudy\db_data:/var/lib/postgresql/data `
-p 5433:5432 `
-e POSTGRES_PASSWORD=post `
--rm `
postgres
```
