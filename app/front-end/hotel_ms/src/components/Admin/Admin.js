import React from 'react';
import { Link } from 'react-router-dom';

const Admin = () => {
  const raccoonStyle = {
    width: "150px",
    height: "150px",
  };

  return (
    <div>
      <h1>Admin Page</h1>
      <div>
        <img
          id="raccoon"
          style={raccoonStyle}
          src="/resources/raccoon.jpeg"
          alt="Raccoon"
        />
      </div>
      <Link to="/home">Go to Home Page</Link>
    </div>
  );
}

export default Admin;
