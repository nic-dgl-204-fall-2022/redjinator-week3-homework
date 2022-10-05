# Week3-homework

I made the following changes to our toy car example.

* Made Car() open so I could inherit from it.
* Made an interface called TimeTravel with 3 members
1. capacitorIsCharged: Boolean
2. chargeFluxCapacitor() method
3. timeTravel() method
* Created a class called Dalorian which inherits from Car() and the TimeTravel interface.
* Implemented the members of the interface in the Dalorian. Requiring the flux capacitor to be charged before being able to time travel.

## Reflection

I had fun making the changes and implementing my Dalorian, making sure you needed to charge the flux capacitor before time travelling.  It was a fairly easy and simple modification which I could have expanded on more. I did not have to reference any additional material for completing the homework which I was pleased with as interfaces were a little troublesome for me in the not so distant past, particularly in Java. I did check out Geoff's link you provided afterwards to reinforce the concepts but I haven't finished it yet as it's getting late. I did like his comparison to a front counter at a store or restaurant however. There are lots of things I could still do, it would be easy enough I think to have accelerate take in a double and increase a speed variable that we could put in the Drivable interface and implement in Car and have the approach to 88mph in whatever increments the user wants, then plug in various responses depending on if you hit 88mph without the capacitor charged, which could enable the Dalorian to hit the top speed. We could choose the amount of money to spend when we're fueling up, or let the user choose how much to fill up and have payment denied if the funds won't cover the requested amount of fuel.

Overall I'm feeling pretty good about how things are flowing this week.
