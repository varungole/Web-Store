import React from 'react'

function Footer() {
  return (
    <footer class="footer">
    <div class="footer-content">
        <div class="footer-section about">
            <h2>About Us</h2>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla facilisi.</p>
        </div>
        <div class="footer-section contact">
            <h2>Contact Us</h2>
            <p>Email: info@example.com</p>
            <p>Phone: +123 456 789</p>
        </div>
        <div class="footer-section social">
            <h2>Follow Us</h2>
            <a href="#" target="_blank">Facebook</a>
            <a href="#" target="_blank">Twitter</a>
            <a href="#" target="_blank">Instagram</a>
        </div>
    </div>
    <div class="footer-bottom">
        &copy; 2024 Web Store. All rights reserved.
    </div>
</footer>
  )
}

export default Footer