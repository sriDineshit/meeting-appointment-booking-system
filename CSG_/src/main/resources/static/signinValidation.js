function signIn() {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    var userData = {
        email: email,
        password: password
    };

    fetch('/api/users/signin', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to sign in');
        }
        return response.json();
    })
    .then(data => {
        // Handle authenticated user data
        console.log('Authenticated User:', data);
        alert('Signed in successfully');
        // Additional logic after successful signin
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Failed to sign in');
    });
}
