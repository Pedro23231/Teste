function showNotification() {
    var notification = document.getElementById('notification');
    notification.classList.add('show');

    setTimeout(function() {
        notification.classList.remove('show');
    }, 3000);
}

function mostrarManutencao() {
    var notification1 = document.getElementById('notification1');
    notification1.classList.add('show');

    setTimeout(function() {
        notification1.classList.remove('show');
    }, 3000);
}