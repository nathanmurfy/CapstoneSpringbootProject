For my Spring application I want to use what i made in the java app and store the information using a database.

What will the microservice do?
My microservice will take the users input about their training sessions and hold their information in a database. The
User will be able to access their files about their previous weight training sessions and compare numbers to see if
progress has been made. The microservice will allow the user to keep track of the lifts they did on the day, the
weight that they used with that lift, the amount of reps and sets done on that lift and the specific body parts
trained with the lift. I am hoping with all this information kept for the user they will no longer keep guessing what
and what has not been achieved. I'm also wanting to put a one rep max section where you can keep track of the heaviest
weight done on a specific lift (mostly for squat, bench and dead lift). All this will be achieved either with the database
holding the files or perhaps an Excel type spreadsheet with html and CSS components.

What business problem it addresses?
When you weight train it is easy to just turn up to the gym and lift weights, that's the easiest part. This doesn't do
much good if you are unaware of your previous lifts and the weight and volume done with the exercises. I am not the best
with keeping track, and I know many others like that as well, so I wanted to make something me and others could use to
maximise training efficacy and break past plateaus. The moment somebody starts keeping track of progress they immediately
see improvement. This is because you push yourself more and are more knowledgeable of what you really can achieve making
it the perfect problem solver for anybody into weight or even body training.

The target audience?
The target audience is for anybody who weight trains and wants to take it seriously. It's for anybody who wants to maximise
their training and get bigger. Even if you don't train seriously It's nice to know what you are doing and if you are making any
progression. Tracking progress is a great tool and everybody should use it, it makes all the difference. Young or old, no
matter what or how you look it's the best thing for anybody.

A few things I require for my project would be to take users input and store it into h2. This would be holding the users lifts that 
they input into the web page adn then gets stored. I require to use a spring boot project with maven and html and css. These two will
come together in the end for the final project. This will make a complete spring boot and thymeleaf project. I will need a controller, entity,
and repository. Also, I will try and make two html files. Will start with one and then try and incorporate the second.

List of features -
.Specific page for recommend exercises. This allows the user to be able to explore new exercises or great for people just
starting to work out. This gives the user variety.

.Progress tracking. This is the main feature of the application. All progress can be tracked here on the web page itself.

.The h2 database. All entered progress in the web page gets stored here so no matter what happens to the web page h2 will have
all of your progress saved.

The HTML page will have a table with past lifts recorded. I've made the website to be easy to understand, and very accessible.
For the users ive also linked a website which shows a few recommend exercises that the user can try if they are new  to weight
lifting and wish to expand their workout regime. I wanted to make a second webpage to show my own but i am not sure how to do
that yet and will keep trying.

Now when a user saves their workout it will get stored on the webpage, and the h2 database. This works for ease of
access when given two option to see their past workouts on. One thing I was keeping in mind is sometimes there is weight
and rep fluctuation in between a certain exercise. I felt it would be easiest for the user to just enter in how many reps
they did with a certain weight and change when ever they need, so they are not stuck with a certain weight or rep range.

I have made the second web page with suggested exercises. I have two categories. One is compound movements and the other is accessories.
You can get a good workout just doing these movements but i am thinking of adding a few more. This way it gives the user more variety.

