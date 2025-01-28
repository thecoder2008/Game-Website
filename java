console.log('Script loaded');

var button = document.querySelector('.game-button');
if (button) {
    console.log('Button found');
    button.addEventListener('click', function() {
        console.log('Button clicked');
        window.location.href = 'games.html';
    });
} else {
    console.log('Button not found');
}
console.log('Script loaded');

var gameButton = document.querySelector('.game-button');
if (gameButton) {
    console.log('Game button found');
    gameButton.addEventListener('click', function() {
        console.log('Game button clicked');
        window.location.href = 'games.html';
    });
} else {
    console.log('Game button not found');
}

var downloadButton = document.querySelector('a[download] button');
if (downloadButton) {
    console.log('Download button found');
    downloadButton.addEventListener('click', function() {
        console.log('Download button clicked');
    });
} else {
    console.log('Download button not found');
}
