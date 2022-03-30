import React, { useState } from 'react';
import { MenuItems } from 'components/MenuItem';
import { Link } from 'react-router-dom'
import './styles.css';

function Dropdown() {
  const [click, setClick] = useState(false)
  const handleClick = () => setClick(!click)

  return (
    <>
      <ul onClick={handleClick}
        className={click ? 'dropdonw-menu clicked' : 'dropdonw-menu'}>
        {MenuItems.map((item, index) => {
          return (
            <li key={index}>
              <Link className={item.cName}
                to={item.path} onClick={() =>
                  setClick(false)}>
                {item.title}
              </Link>
            </li>
          )
        })}

      </ul>
    </>
  );
}

export default Dropdown;
