/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  View,
  TouchableOpacity,
  Text,
} from 'react-native';
// App.js or any component
import CustomScreen from './CustomScreenNativeModule';

function App(): React.JSX.Element {
  const handleButton1Press = async () => {
    try {
      CustomScreen.showCustomScreen();
      console.log('Navigation result:');
    } catch (error) {
      console.error('Navigation error:', error);
    }
  };

  const handleButton2Press = async () => {
    try {
      CustomScreen.showCustomScreen();
      console.log('Navigation result:');
    } catch (error) {
      console.error('Navigation error:', error);
    }
  };

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.buttonContainer}>
        <TouchableOpacity
          style={styles.button}
          onPress={handleButton1Press}
          hasTVPreferredFocus={true}>
          <Text style={styles.buttonText}>Navigate to Screen 1</Text>
        </TouchableOpacity>

        <TouchableOpacity
          style={styles.button}
          onPress={handleButton2Press}>
          <Text style={styles.buttonText}>Navigate to Screen 2</Text>
        </TouchableOpacity>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#000',
    justifyContent: 'center',
    alignItems: 'center',
  },
  buttonContainer: {
    width: '80%',
    gap: 20,
  },
  button: {
    backgroundColor: '#2196F3',
    padding: 20,
    borderRadius: 8,
    alignItems: 'center',
    justifyContent: 'center',
    minHeight: 60,
  },
  buttonText: {
    color: '#FFFFFF',
    fontSize: 24,
    fontWeight: 'bold',
  },
});

export default App;
