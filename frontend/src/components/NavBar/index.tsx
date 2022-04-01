import React, { useState } from 'react';
import { Button } from 'components/Button';
import { Link } from 'react-router-dom';
import Dropdown from 'components/Dropdown';
import IWLogo from 'assets/img/w-logo.svg';
import './styles.css'
function Navbar() {
    const [click, setClick] = useState(false);
    const [dropdown, setDropdown] = useState(false);
  
    const handleClick = () => setClick(!click);
    const closeMobileMenu = () => setClick(false);
  
    const onMouseEnter = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(true);
      }
    };
  
    const onMouseLeave = () => {
      if (window.innerWidth < 960) {
        setDropdown(false);
      } else {
        setDropdown(false);
      }
    };
  
    return (
      <>
        <nav className='navbar'>
          <Link to='/' onClick={closeMobileMenu}>
          <img className='navbar-logo' src={IWLogo} alt='logo' />
          </Link>
          <div className='menu-icon' onClick={handleClick}>
            <i className={click ? 'fas fa-times' : 'fas fa-bars'} />
          </div>
          <ul className={click ? 'nav-menu active' : 'nav-menu'}>
            <li className='nav-item'>
              <Link to='/' className='nav-links' onClick={closeMobileMenu}>
                Home
              </Link>
            </li>
            <li
              className='nav-item'
              onMouseEnter={onMouseEnter}
              onMouseLeave={onMouseLeave}
            >
              <Link
                to='/explorar'
                className='nav-links'
                onClick={closeMobileMenu}
              >
                Explorar <i className='fas fa-caret-down' />
              </Link>
              {dropdown && <Dropdown />}
            </li>
            <li className='nav-item'>
              <Link
                to='/suporte'
                className='nav-links'
                onClick={closeMobileMenu}
              >
                Suporte
              </Link>
            </li>
            
            <li>
              <Link
                to='/sign-up'
                className='nav-links-mobile'
                onClick={closeMobileMenu}
              >
                Sign Up
              </Link>
            </li>
          </ul>
          <Button />
        </nav>
      </>
    );
  }
  
  export default Navbar;