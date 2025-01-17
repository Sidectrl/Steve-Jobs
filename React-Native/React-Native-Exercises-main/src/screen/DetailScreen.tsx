import React from "react";
import { View, Text, StyleSheet, Button } from "react-native";
import ScreenFC from "../models/ScreenFC";

const DetailScreen: ScreenFC<"Detail"> = ({ route, navigation }) => {
  return (
    <View style={styles.container}>
      <Text>DetailScreen {route.params?.id}</Text>
      <Button title="Setting" onPress={() => navigation.navigate('Setting')}/>
    </View>
  );
};

const styles = StyleSheet.create({  
  container: {
    flex: 1,
    alignItems: "center",
    justifyContent: "center",
  },
});

export default DetailScreen;
