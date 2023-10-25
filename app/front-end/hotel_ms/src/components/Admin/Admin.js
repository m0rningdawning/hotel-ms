import React from 'react';
import { Link } from 'react-router-dom';

const Admin = () => {
  return (
    <div>
      <h1>Admin Page</h1>
      <Link to="/home">Go to Home Page</Link>
    </div>
  );
}

export default Admin;
