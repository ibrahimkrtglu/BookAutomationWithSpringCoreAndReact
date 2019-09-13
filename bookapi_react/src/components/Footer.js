import React from 'react'

class Footer extends React.Component{
    render(){
        return(
        <div className="divFooter">
            <nav class="navbar" role="navigation">
                <img src="https://s3.amazonaws.com/plloyd/codepen/animated-menu-logo.svg" />
            </nav>

            <div id="content">
                
            </div>

            <footer id="mobile-footer">
                <div id="mobile-menu">
                    <div id="mobile-footer-container">
                        <div class="mobile-link">
                            <a href="#" class="text-center">My Account</a>
                        </div>
                        <div class="mobile-link">
                            <a href="#" class="text-center">Reviews</a>
                        </div>
                        <div class="mobile-link">
                            <a href="#" class="text-center">Contact Us</a>
                        </div>
                    </div>
                </div>
                <div id="mobile-footer-close">
                    <button id="mobile-footer-btn">
                    <div class="mobile-btn-close is-rotating-back">
                        <span></span>
                    </div>
                    </button>
                </div>
            </footer>

        </div>
        )
    }
}

export default Footer;