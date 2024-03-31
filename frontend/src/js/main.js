document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault();

    const email = document.getElementById('email').value;
    const senha = document.getElementById('senha').value;

    fetch('/api/authenticate', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ email, senha }),
    })
        .then(response => response.json())
        .then(data => {
            if (data.success) {
                window.location.href = '/dashboard';
                } else {
                alert('Falha na autenticação');
            }
        })
        .catch((error) => {
            console.error('Error:', error);
        });
});
