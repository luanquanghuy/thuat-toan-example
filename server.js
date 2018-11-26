const request = require('request');

function sendMessage() {
    var date = new Date();
    var message = date.getHours() + ':' + date.getMinutes();
    
}

sendMessage();
setInterval(sendMessage, 600000);