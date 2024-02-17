# Game App using Strategy Pattern
We have three types of characters in a GameApp...
      1. Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
      2. Wizard: Casts spells; uses magic barrier to defend
      3. Archer: Shoots arrows; uses dodge to to defend

...And there are two types of strategy...
A.  DefenseStrategy
     1. Shield
     2. Dodge
     3. CreateMagic

B.  AttackStrategy
     1.  CastSpell
     2.  ShootArrow
     3.  SwingSword  

...Using the Strategy pattern, we can implement flexibility in this system where Characters can easily switch between different strategies without modifying their implementations.
