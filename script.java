// variation of truth questions
var truths = [
    "What's the last lie you told?",
    "What food do you dislike?",
    "What is your phobia",
    "what food do you dislike the most",
    "where would you like to go on vacation",
    "Do you have a crush on someone right now?",
    "What high school did you go to?",
    "What's your biggest fear?",
    "What's your biggest fantasy?",
];

// variation of dares
var dares = [
    "Sing twinkle twinkle little star, backwards",
    "Jog in place for 1 hour?",
    "grab a piece of gum from under the desk and chew it for 15 seconds",
    "Drink tap water",
    "Roll on the ground for 10 feet",
    "Do 10 pushups.",
    "Sing the chorus of your favorite song.",
    "Do a silly dance for 30 seconds.",
];

// Function to display a random truth question
function showTruth() {
  var randomIndex = Math.floor(Math.random() * truths.length);
  document.getElementById('result').textContent = "Truth: " + truths[randomIndex];
}

// Function to display a random dare question
function showDare() {
  var randomIndex = Math.floor(Math.random() * dares.length);
  document.getElementById('result').textContent = "Dare: " + dares[randomIndex];
}
