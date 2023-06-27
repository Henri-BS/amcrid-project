import "./styles.css";

import IGithub from "assets/img/git.svg";
import ILinkedin from "assets/img/linked.svg";
import IGmail from "assets/img/gmail.svg";
import IWLogo from "assets/img/ac-logo.png";
import { Link } from "react-router-dom";

function Footer() {
    return (
            <footer className="footer-container">
                <div className="row">
                    <div className="footer-grid-container col-sm-12  col-xl-4 ">
                        <ul className="list-unstyled mx-10">
                            <h3>Site</h3>
                            <hr />
                            <li className="mb-2">Sobre Nós</li>
                            <li className="mb-2">Perguntas Frequentes</li>
                            <li className="mb-2">Mapa do Site</li>
                            <li className="mb-2">Novidades</li>
                        </ul>
                    </div>
                    <div className="footer-grid-container col-sm-12  col-xl-4 ">
                        <ul className="list-unstyled">
                            <h3>Conta</h3>
                            <hr />
                            <li className="mb-2">Cadastro</li>
                            <li className="mb-2">Login</li>
                            <li className="mb-2">Receber notificações por Email</li>
                            <li className="mb-2">Privacidade e Segurança</li>
                        </ul>
                    </div>
                    <div className="footer-grid-container col-sm-12  col-xl-4 ">
                        <ul className="list-unstyled">
                            <h3 >Contato</h3>
                            <hr />
                            <li className="row mb-3 mx-16 ">
                                <Link to="/">
                                    <img className='footer-img' src={IGithub} alt='logo' />
                                    /Github
                                </Link>
                            </li>
                            <li className="row mb-3 mx-16 ">
                                <Link to="/">
                                    <img className='footer-img' src={ILinkedin} alt='logo' />
                                    /LinkedIn
                                </Link>
                            </li>
                            <li className="row mb-3 mx-16">
                                <Link to="/">
                                    <img className='footer-img' src={IGmail} alt='logo' />
                                    /Gmail
                                </Link>
                            </li>
                        </ul>
                    </div>
                    <hr />
                </div>
                <div className="footer-base-container">
                    <div className="row">
                            <img className="footer-logo col-3" src={IWLogo} alt='logo' />

                        <div className="footer-base-text-container col-9">
                            <h5>Amcrid</h5>
                            todos os direitos reservados.
                        </div>
                    </div>
                </div>
            </footer>
    );
}
export default Footer;
