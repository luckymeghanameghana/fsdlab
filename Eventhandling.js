import React, { useState } from 'react';

function EventHandling() {
  const [count, setCount] = useState(0);

  const countIncrement = () => {
    setCount(count + 1);
  };

  const pageStyle = {
    display: 'flex',
    justifyContent: 'center',
    alignItems: 'center',
    minHeight: '100vh',
  };

  const EventDivStyle = {
    textAlign: 'center',
    padding: '20px',
    width: '300px',
    height: '300px',
    display: 'flex',
    flexDirection: 'column',
    justifyContent: 'center',
    borderRadius: '10px',
    border: '1px solid black',
  };

  const buttonStyle = {
    padding: '10px 20px',
    border: '1px solid black',
    borderRadius: '5px',
    cursor: 'pointer',
    margin: '10px 5px', // Adds space between buttons
  };

  return (
    <div style={pageStyle}>
      <div style={EventDivStyle}>
        <h2>Click the button to increment the count</h2>
        <h2>Count is: {count}</h2>
        <button
          onClick={countIncrement}
          style={buttonStyle}
        >
          Increment
        </button>
        <button
          onClick={() => setCount(0)}
          style={buttonStyle}
        >
          Reset
        </button>
      </div>
    </div>
  );
}

export default EventHandling;
