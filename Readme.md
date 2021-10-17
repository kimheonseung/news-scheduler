# News Scheduler

### Library & Framework
- Spring Data JPA
- Spring Data Elasticsearch
- Lombok
- Jsoup
- Spring Boot (non-web)
- Gradle

### Packages
- com.devh.common : Common Package
- com.devh.scheduler.news.configuration : Java Configurations
- com.devh.scheduler.news.constant : Constants
- com.devh.scheduler.news.dto : DTO
- com.devh.scheduler.news.entity : Entity
- com.devh.scheduler.news.repository : Spring Data Repository
- com.devh.scheduler.news.core : Data Scraping Scheduler
- com.devh.scheduler.news.service : Service for request
- com.devh.scheduler.news.util : Utils

### Configuration File
- server.ip : server ip (using mtu control)
- database.ip : db ip
- database.port : db port
- database.schema : db name
- database.username : db username
- database.password : db password
- elasticsearch.ip : es ip
- elasticsearch.port : es port
```
server.ip=192.168.0.3
database.ip=127.0.0.1
database.port=3306
database.schema=devh
database.username=devh
database.password=1234
elasticsearch.ip=127.0.0.1
elasticsearch.port=9200
```

### Build  
1. Gradle clean & build
2. Create some directory
   - mkdir news-scheduler
3. Move Jar to directory
   - mv build/libs/news-scheduler-v1.jar news-scheduler
4. Create conf file
   - news-scheduler/conf/news-scheduler.properties
5. Package Directory Tree
   - news-scheduler
     - news-scheduler-v1.jar
     - conf
       - news-scheduler.properties
6. Check Database & Elasticsearch
7. Run Jar (java)
---
## Database & Elasticsearch Settings
- [Check docker] (https://github.com/kimheonseung/docker-devh-dbes)
