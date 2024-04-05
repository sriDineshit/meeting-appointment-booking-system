function signUp() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    var userData = {
        name: name,
        email: email,
        password: password
    };

    fetch('/api/users/signup', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(userData)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Failed to sign up');
        }
        alert('Signed up successfully');
        // Additional logic after successful signup
    })
    .catch(error => {
        console.error('Error:', error);
        alert('Failed to sign up');
    });
}
