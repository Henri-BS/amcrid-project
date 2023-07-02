import "./styles.css";

import IGithub from "assets/img/git.svg";
import ILinkedin from "assets/img/linked.svg";
import IGmail from "assets/img/gmail.svg";
import IWLogo from "assets/img/ac-logo.png";
import { Link } from "react-router-dom";

function Footer() {
    return (
        <footer className="footer-container">
                               <h4 >Contato com o Desenvolvedor</h4>

                    <ul className="footer-grid-container row list-unstyled">                

                        <li className="col-12 col-lg-4 ">
                            <Link to="/">
                                <img className='footer-img' src={IGithub} alt='logo' />
                                Github
                            </Link>
                        </li>
                        <li className="col-12 col-lg-4">
                            <Link to="/">
                                <img className='footer-img' src={ILinkedin} alt='logo' />
                                LinkedIn
                            </Link>
                        </li>
                        <li className="col-12 col-lg-4">
                            <Link to="/">
                                <img className='footer-img' src={IGmail} alt='logo' />
                                Gmail
                            </Link>
                        </li>
                    </ul>
            <div className="footer-base-container">
                <div className="row">
                    <img className="footer-logo col-3" src={IWLogo} alt='logo' />
                    <div className="footer-base-text-container col-9">
                        <h5>Amcrid 2023</h5>
                        plataforma de desenvolvimento criativo
                    </div>
                </div>
            </div>
        </footer>
    );
}
export default Footer;
