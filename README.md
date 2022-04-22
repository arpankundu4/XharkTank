<div align="center">
<h1 align="center">
 <a href = "https://rebrand.ly/xharktank-pitches-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/">🦈 XharkTank</a>
</h1>

<center><a href = "https://rebrand.ly/xharktank-pitches-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/">Pitch UI</a> &nbsp;|&nbsp; <a href = "https://rebrand.ly/xharktank-invest-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/">Invest UI</a> &nbsp;|&nbsp; <a href = "https://xharktank-app.herokuapp.com/swagger-ui/#/xharktank">Swagger UI</a></center>

<h2 align ="center">Congratulations, We have a Deal!</h2>

<p align="center">
   <a href="https://github.com/arpankundu4/XharkTank/blob/main/LICENSE">
      <img src="https://img.shields.io/badge/License-MIT-green.svg" />
   </a>
</p>
</div>

XharkTank is an application where entrepreneurs can pitch ideas for a business or product they wish to develop, and investors can make counter offers to the same. It helps connect budding entrepreneurs with investors.

XharkTank is a part of <b>Crio Launch 2022</b>.

In this mini-project, I:

>    1) Implemented the core logic for the REST API backend. 
>    2) Deployed the backend on a server.
>    3) Connected the backend to the frontend provided by Crio.


### XharkTank High-Level Architecture

![xharktank_architecture](https://user-images.githubusercontent.com/80940234/162623199-431368ac-76b8-45fb-acab-889e47dd38df.png)

The web app is now live at:

- `Entrepreneurs`
    <br>[https://rebrand.ly/xharktank-pitches-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/](https://rebrand.ly/xharktank-pitches-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/)
    
- `Investors`
    <br>[https://rebrand.ly/xharktank-invest-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/](https://rebrand.ly/xharktank-invest-http/?author=arpan-kundu-4&url=https://xharktank-app.herokuapp.com/)
    
![xharktank-ui](https://user-images.githubusercontent.com/80940234/162620264-3c1ed47c-0630-49bd-a407-5979da2c0be7.png)

> Backend server is now live at [https://xharktank-app.herokuapp.com](https://xharktank-app.herokuapp.com)

### REST API Endpoints

1. Create a new pitch
    <br>`POST /pitches`
    
2. Make a counter offer to a pitch 
    <br>`POST /pitches/<pitch_id>/makeOffer`
    
3. Fetch all pitches 
    <br>`GET /pitches`
    
4. Fetch a single pitch by id 
    <br>`GET /pitches/<pitch_id>`



<div align="center">
<img width="500" alt="swagger-ui" src="https://user-images.githubusercontent.com/80940234/163606490-d0e4e585-7ca4-4b82-9ba7-70b5df1fb99e.png">
</div>

> Swagger API documentation at [https://xharktank-app.herokuapp.com/swagger-ui/#/xharktank](https://xharktank-app.herokuapp.com/swagger-ui/#/xharktank)

### Technology Stack Used

- Java 11
- Springboot 2.6.2
- MongoDB 4.2
- Maven
- Swagger
- Postman
- Heroku

### Clone The Repository

```terminal
$ git clone https://gitlab.crio.do/COHORT_ME_BUILDOUT_XHARKTANK_ENROLL_1648956266180/arpan-kundu-4-ME_BUILDOUT_XHARKTANK.git
```

### Setup

From terminal:

1. Type `cd arpan-kundu-4-ME_BUILDOUT_XHARKTANK`
2. Type `chmod +x setup.sh`
3. Type `./setup.sh`

### Run Backend Server Locally

From terminal:

1. Type `cd arpan-kundu-4-ME_BUILDOUT_XHARKTANK`
2. Type `chmod +x server_run.sh`
3. Type `./server_run.sh`
4. Server will start on `localhost:8081`

### Contact

Always happy to connect for feedback or discussions :)

[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/arpankundu4)
[![Email](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:arpan.kundu.4@gmail.com)