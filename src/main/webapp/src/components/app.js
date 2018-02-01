import React from 'react';
import ReactDom from 'react-dom';

class App extends React.Component {
    render() {
        return (
          <b>ReactJS Application Hello</b>
        );
    }
}
ReactDom.render(<App />, document.getElementById('react'));